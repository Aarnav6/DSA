import java.util.HashSet;

public class UniqueSubSequence {
    public static void uniqueSubSeq(String str , int idx ,String newString , HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
            }
            return;
        }
        char currentChar = str.charAt(idx);
        // to be 
        uniqueSubSeq(str, idx+1, newString + currentChar , set);
        
         // not to be
        uniqueSubSeq(str, idx+1, newString , set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSubSeq("aaa" , 0 ,"",set);
    }
}