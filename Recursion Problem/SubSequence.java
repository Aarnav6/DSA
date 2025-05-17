public class SubSequence {
    public static void subSeq(String str , int idx ,String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        // to be 
        subSeq(str, idx+1, newString + currentChar);
        
         // not to be
        subSeq(str, idx+1, newString);
    }
    public static void main(String[] args) {
        subSeq("abc" , 0 ,"");
    }
}