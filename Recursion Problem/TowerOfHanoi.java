public class TowerOfHanoi {

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}

// in my notes i considered solveHanoi(n - 1, source, destination, auxiliary); as statement 1
// in my notes i considered System.out.println("Move disk " + n + " from " + source + " to " + destination); as statement 2
// in my notes i considered solveHanoi(n - 1, auxiliary, source, destination); as statement 3