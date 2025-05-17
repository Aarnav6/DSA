import java.util.Scanner;
public class PrintStringReverse {
    private String reversedString;
    private final String stringEnteredByUser;
    int index;
    private final Scanner scanner = new Scanner(System.in);
    PrintStringReverse () {
        System.out.print("Enter a string to reverse: ");
        this.stringEnteredByUser = scanner.nextLine();
        index = stringEnteredByUser.length()-1;
        reversedString = ""; 
    }
    public void reverseStr() {
        if(index < 0) {
            System.out.println(reversedString);
            return;
        }
        this.reversedString += stringEnteredByUser.charAt(index);
        index--;
        reverseStr();
    }
    public void check() {
        if(reversedString.equalsIgnoreCase(stringEnteredByUser))
        System.out.println("Also your string is palindrome");
        else
        System.out.println("But your string is not palindrome");
        
    }
    public static void main(String[] args) {
        PrintStringReverse call = new PrintStringReverse();
        call.reverseStr();
        call.check();
    }
}
//                          Method 2
/*
public class PrintStringReverse {
    public static void ReverseStr(String str , int index) {
        if(index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        ReverseStr(str, index-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        ReverseStr(str, str.length()-1);
    }
}
*/