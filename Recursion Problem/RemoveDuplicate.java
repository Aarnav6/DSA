public class RemoveDuplicate {
    public static String revDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[26];
        revDuplicate(str, 0, sb, seen); // call overloaded method
        return sb.toString();
    }

    private static void revDuplicate(String str, int idx, StringBuilder sb, boolean[] seen) {
        if (idx == str.length()){
            return;
        } 
        char currentChar = str.charAt(idx);

        if (!seen[currentChar - 'a']) {
            sb.append(currentChar);
            seen[currentChar - 'a'] = true;
            revDuplicate(str, idx + 1, sb, seen);
        }
        revDuplicate(str, idx + 1, sb, seen);
        //   the if block above can be written as this bellow it means the same its just for small and cleaner code
        //   the code bellow is the larger explained version
        /*
        if (seen[currentChar - 'a']) {
            revDuplicate(str, idx + 1, sb, seen);
        }else {
            seen[currentChar - 'a'] = true;
            sb.append(currentChar);
            revDuplicate(str, idx + 1, sb, seen);
        }
        */
        }

    public static void main(String[] args) {
        String result = revDuplicate("aaabasjighfa");
        System.out.println(result);
    }
}
