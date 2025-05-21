public class PlaceTiles {
    public static int placeTilesWays(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        // place horrizontally
        int horrPlacements = placeTilesWays(n-1, m);
        
        // place vertiacally
        int vertPlacements = placeTilesWays(n-m, m);

        return horrPlacements + vertPlacements;
    }
    public static void main(String[] args) {
        int n = 4 , m = 2;
        int totalWays = placeTilesWays(n, m);
        System.out.println(totalWays);
    }
}
