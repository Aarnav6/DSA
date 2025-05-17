public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keyCombinations(String str , int idx , String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(idx); // this gives values like 2 at idx 0 and 3 at idx 1
        /*
        int num = currChar - '0'; // onverts the current character into number i wrote it in this line just for clarrification 
        String mapping = keypad[num]; // thats how it picks string from array keyboard and stores string in mapping with num as index of array
        */
        String mapping = keypad[currChar - '0'];
        
        for (int i=0 ; i<mapping.length() ; i++) {
           keyCombinations(str, idx+1, newString + mapping.charAt(i));
        }
    }
    public static void main (String [] args) {
        keyCombinations("23", 0," ");
    }
}