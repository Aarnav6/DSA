public class FindOccurance {
    private int index, lastIndex, counter, firstIndex = -1;
    char key;
    String str;
    public void occuranceCheck() {
        if(index == str.length()) { // base case
            return;
        }
        if(Character.toLowerCase(str.charAt(index)) == Character.toLowerCase(key)) {
            counter++;
            if(firstIndex == -1) {
                firstIndex = index;
            }
            else {
                lastIndex = index;
            }
        }
        index++;
        occuranceCheck();
    }
    public void occurancePrint() {
        if(firstIndex == -1) {
            System.out.println(key + " this character dosent exist in your string");
        }
        else {
            if(lastIndex == -1) {
                System.out.println(key + " this character in your string appeared only single time at: " + firstIndex + " index");
            }
            else{
                System.out.println(key + " first appreared at: " + firstIndex + " index");
                System.out.println(key + " last appreared at: " + lastIndex + " index");
                System.out.println(key + " appreared total of " + counter + " times");
            }
        }
    }
    public FindOccurance(String str , char key){
        this.str = str;
        this.key = key;
    }
    public static void main(String[] args) {
        FindOccurance call = new FindOccurance("Testing" , 'a');
        call.occuranceCheck();
        call.occurancePrint();
    }
}