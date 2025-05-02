public class InsertionSort {
    public static int idx;
    public static int comparingVal;
    public static int[] sortArr(int[] arr , byte runConfig) {
        for(int i=1 ; i<arr.length ; i++) {
            idx = i; // always maintaing the value of index so, if shifting doesnt happen it will reassign value same value at same index
            comparingVal = arr[i];
            for(int j = i-1 ; j>=0 ; j--) {
                if(runConfig == 0) {
                    if(arr[j] > comparingVal) { // condition for ascending 
                        arr[j+1] = arr[j];
                        idx = j;
                    } else {
                        break;
                    }
                } 
                else if (runConfig == 1) {
                        if(arr[j] < comparingVal) { // condition for descending
                            arr[j+1] = arr[j];
                            idx = j;
                        } else {
                            break;
                        }
                }
            }
            arr[idx] = comparingVal; // if shifiting doesnt happen simply reassign same value back  
        }
        return arr;
    }
    public static int[] sortAscending(int[] InputArray) {
        return sortArr(InputArray, (byte)0);    
    }
    public static int[] sortDescending(int[] InputArray) {
        return sortArr(InputArray, (byte)1);    
    }
    public static void printArr(int[] arr){
        for(int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int[] Arr = {0 , 4 , 1  , 5 , 2 , 6 , 3 , 7}; 
        int[] res1 = sortAscending(Arr.clone());
        int[] res2 = sortDescending(Arr.clone());

        System.out.println("sorting Ascending: "); 
        printArr(res1);        
        System.out.println("sorting Descending: "); 
        printArr(res2);
    }
}

/*
// in this code the only diffrence is that it checks if the shifiting was done 
// if yes then it allows the putting of value if not then it dosent 
// in the above code it was done by setting idx = i value each time so that if the shiffting doesnt take place it will shift
// current value with current value 
public class InserstionSort {
    public static int sorted;
    public static int idx;
    public static int comparingVal;
    public static boolean check;

    public static int[] sortArr(int[] arr) {
        for(int i=1 ; i<arr.length ; i++) {
            check = false;
            comparingVal = arr[i];
            for(int j = i-1 ; j>=0 ; j--) {
                if(arr[j] > comparingVal) {
                    check = true; 
                    arr[j+1] = arr[j];
                    idx = j;
                } else {
                    break;
                }
            }
            if(check) {
                arr[idx] = comparingVal; // value putting if the shifiting was done else it doesnt run to prevent wrong putting 
            }
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] Arr = {7,89,51,236,0}; 
        int[] sortedArr = sortArr(Arr);
        printArr(sortedArr);
    }
}
*/