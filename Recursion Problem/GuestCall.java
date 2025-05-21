public class GuestCall {
    public static int numberOfWays(int guest) {
        if(guest <= 1) {
            return 1;
        }

        // single guest invite
        int ways1 = numberOfWays(guest - 1 );

        // invite in pairs
        int ways2 = (guest - 1)* numberOfWays(guest - 2);

        return  ways1 + ways2;
    }
    public static void main(String[] args) {
        int guest = 4;
        int ans = numberOfWays(guest);
        System.out.println(ans);
    }
}