public class BubbleSort {
    public static void sortArrayAscending(int arr[]) {
        for(int i=0 ; i<arr.length-1 ; i++) { // we need to sort n-1 element since last element will already br in its correct postions after sorting n-1 element
            for (int j=0 ; j<arr.length-1 ; j++) { // this tuns to arr.length-1 times since were comparing with +1 element so it can give arrayIndexOutofBound error 
                if (arr[j] > arr[j+1]) {
                    // then we shift element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] ary) {
        for(int i : ary) {
            System.out.print(i + " ");
        }
        System.out.print("\n"); // for next line print
    }
     public static void main(String[] args) {
        int[] elements = {7,8,3,5,6};
        sortArrayAscending(elements);
        printArray(elements);
    }
}