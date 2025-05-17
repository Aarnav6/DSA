public class MoveAllKeyToEnd {
    private int count = 0;  // Counter for occurrences of 'key'

    // Method to start recursion with StringBuilder
    public String mover(String input, char key, int index) {
        StringBuilder sb = new StringBuilder(input);  // Create StringBuilder from input
        return mover(sb, key, index);  // Start recursion with StringBuilder directly
    }

    // Recursive method that works with StringBuilder directly
    private String mover(StringBuilder sb, char key, int index) {
        // Base case: when index reaches the end of the string
        if (index == sb.length()) {
            // Append all 'key' characters at the end
            for (int i = 0; i < count; i++) {
                sb.append(key);
            }
            return sb.toString();  // Convert StringBuilder to String and return
        }

        // If the current character is the 'key', remove it and increment count
        if (sb.charAt(index) == key) {
            sb.deleteCharAt(index);  // Remove the character at the current index
            count++;  // Increase count of 'key' characters
            // Do not increment index if a character is deleted because the string shrinks
        } else {
            index++;  // Move to the next index if no deletion happens
        }

        // Continue recursion with the updated StringBuilder and index
        return mover(sb, key, index);  // Pass the updated StringBuilder directly
    }

    public static void main(String[] args) {
        MoveAllKeyToEnd call = new MoveAllKeyToEnd();
        String res = call.mover("aarnav", 'a', 0);  // Input string with key 'a'
        System.out.println(res);  // Expected Output: rnvaaa
    }
}


// this code bellow has this subtle issue in the logic when i wrote it 
// since i convert the sb to string it looses refrence although its not wrong
// it looses memory efficiency due to creating a new refrence for each new object
// it is verry bad in terms of speed comparision
/*
public class MoveAllKeyToEnd {
    private int count=0;
    public String mover(String input ,char key , int index) {
        StringBuilder sb = new StringBuilder(input); 
        if(index == input.length()) {
            for(int i=0 ; i<count ; i++) {
                sb.append(key);
            }
        return sb.toString();
        }
        if(sb.charAt(index) == key) {
            sb.deleteCharAt(index);
            count++;
        }
        else{
            //    this is because after deleting a character the index moves ahead by 1 extra,
            //    since all are shifiting backwards so this condition only allows index to move ahead,
            //    only when the deletion is not happening.
            index++;
        }
        return mover(sb.toString(), key, index);
    }
    public static void main(String[] args) {
        MoveAllKeyToEnd call = new MoveAllKeyToEnd();
        String res = call.mover("aarnav",'a',0);
        System.out.println(res);
    }
}
*/


//  the code bellow is the one i learnt from my online classes
/*
public class MoveAllKeyToEnd {
    public static void moveAllX(String str, int idx, int count, String newStr) {
        if(idx == str.length()) {
            for(int i=0 ; i<count ; i++) {
                newStr += "x";
            }
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == 'x') {
            count++;
            moveAllX(str, idx+1, count, newStr);
        }
        else{
            newStr +=  currentChar;
            moveAllX(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        moveAllX("axbxcxd", 0, 0, "");
    }
}
*/
