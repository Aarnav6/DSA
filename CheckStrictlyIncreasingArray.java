import java.util.Scanner;
public class CheckStrictlyIncreasingArray {
    // private int index = -1;   // for recursion based input turn it on
    private int size;
    int[] inputArray;
    Scanner sc = new Scanner(System.in);

/*       // this method is to perform input with recursion but its not bettter than loop explained bellow why ?
    public int[] takeArray() {
        if (index == -1) {
            System.out.print("enter the no. of elements: ");
            size = sc.nextInt();
            inputArray = new int[size];
            index++;
            return takeArray();

        }
        else if(index == inputArray.length){
            return inputArray;
        }
        else {
            System.out.format("enter the element at %d index :",index);
            inputArray[index] = sc.nextInt();
            index++;
            return takeArray();
        }
    }
*/
    public void takeArray() { // this method is to perform input with loop
        System.out.print("enter the no. of elements: ");
        size = sc.nextInt();
        inputArray = new int[size]; // defining array
        for(int i=0 ; i<inputArray.length ; i++) {
            System.out.format("enter element at index %d : ",i);
            inputArray[i] = sc.nextInt();

        }
    }
    public boolean isStrictlyIncreasing(int index) { 
        if(index >= inputArray.length-1) { //base case
            return true;
        }
        /* 
        // optimizing the code given bellow by changing condition to false and return false on false cases 
        // meanwhile doing nothing on true cases just calling a function with increased index
        
        if(inputArray[index] < inputArray[index+1]) { // checking condition
            return isStrictlyIncreasing(index + 1);
        }
        else {
            return false;
        }
        */
        if(inputArray[index] >= inputArray[index+1]) { // optimized code
            return false;
        }
        return isStrictlyIncreasing(index + 1);
    }
    public static void main(String[] args) {
        CheckStrictlyIncreasingArray call = new CheckStrictlyIncreasingArray();
        call.takeArray();
        if (call.isStrictlyIncreasing(0)){ // output depending upon isStrictlyIncreasing value
            System.out.println("is strictly increasing");
        }else{
            System.out.println("is not strictly increasing");
        }
        call.sc.close(); // closing sc object of Scanner class after all work
    }
}

/*
 
📢 Quick Summary Upon Recusion:
Situation:  Should you use recursion?
Simple repeating tasks (like taking inputs)	        ❌ No	Loops are better
Naturally "dividing" problems (like sorting, trees)	✅ Yes	Recursion matches the problem structure
Small, fixed size problems (like factorial of 10)	✅ Yes	Safe, easy
Large unknown size problems without optimization	❌ No	Risk of crash

 */