public class SelectionSort {
    public static void sortArrayAscending (int[] arr) {
        for(int i=0 ; i<arr.length-1 ; i++){
            int smallestElementIndex = i;
            for(int j=i ; j<arr.length ; j++) { // this tuns to arr.length-1 times since were comparing with +1 element so to prevent from arrayIndexOutofBound error were taking loop till arr.length - 1 
                if(arr[smallestElementIndex] > arr[j]) {
                    smallestElementIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestElementIndex];
            arr[smallestElementIndex] = temp;
        }
    }
    public static void printArray(int[] ary) {
        for(int i : ary) {
            System.out.print(i + " ");
        }
        System.out.print("\n"); // for next line print
    }
    public static void main(String[] args) {
        int[] elements = {0,7,8,3,5,6};
        sortArrayAscending(elements);
        printArray(elements);
    }
}