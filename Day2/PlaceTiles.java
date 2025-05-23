package Day2;

public class PlaceTiles {

    public static int placeTiles(int n, int m){

        if(n == m) return 2;

        if( n < m) return 1;

        int verticalPlacements = placeTiles(n - m, m);

        int horizontalPlacements = placeTiles(n - 1, m);

        return verticalPlacements + horizontalPlacements;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        int totalPlacements = placeTiles(n, m);
        System.out.println(totalPlacements);
    }
}
