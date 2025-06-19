class ConcurrencyProblem1 {
    final private static Long START_TIME = System.nanoTime();
    private static Long endTime;
    private static double excutionTime;
    private boolean firstFinished = false;   // !firstFinished check if the first thread finished priniting first or not 
    private boolean secondFinished = false; // !secondFinished check if the second thread finished priniting first or not 

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            printFirst.run();
            firstFinished = true;
            notifyAll();  // wake up second() (and third() if waiting)
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            while (!firstFinished) {
                wait();
            }
            printSecond.run();
            secondFinished = true;
            notifyAll();  // wake up third()
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (this) {
            while (!firstFinished || !secondFinished) {
                wait();
            }
            printThird.run();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // startTime = System.nanoTime();
        var obj = new ConcurrencyProblem1();

        Thread t1 = new Thread(
            () -> {
                try {
                    obj.first(() -> System.out.println("first"));
                } catch (InterruptedException ex) {
                    System.out.println("runtime exception : " + ex.getMessage());
                }
            }, "thread~t1"
        );

        Thread t2 = new Thread(
            () -> {
                try {
                    obj.second(() -> System.out.println("second"));
                } catch (InterruptedException ex) {
                    System.out.println("runtime exception : " + ex.getMessage());
                }
            }, "thread~t2"
        );

        Thread t3 = new Thread(
            () -> {
                try {
                    obj.third(() -> System.out.println("third"));
                } catch (InterruptedException ex) {
                    System.out.println("runtime exception : " + ex.getMessage());
                }
            }, "thread~t3"
        );

        t1.start();
        t2.start();
        t3.start();
        
        
        t1.join();
        t2.join();
        t3.join();

        endTime = System.nanoTime();
        excutionTime = (double) (endTime - START_TIME) / 1_000_000;
        System.out.format("Excution Time : %f ms",excutionTime);

    }
}
