public class MazeProblem {
    public static int findTotalPaths(int currRow , int currColl , int row , int coll) {
        if(currRow >= row || currColl >= coll) {
            return 0;
        }
        if(currRow == row-1 && currColl == coll-1) {
            return 1;
        }
        
        ///going downwards
        int countDownwards = findTotalPaths(currRow+1, currColl, row, coll);
        
        ///going rightwards
        int countRightwards = findTotalPaths(currRow, currColl+1, row, coll);

        return countDownwards + countRightwards;
    }
    public static void main(String[] args) {
        int totalPaths = findTotalPaths(0,0,3, 3);
        System.out.println(totalPaths);
    }
}