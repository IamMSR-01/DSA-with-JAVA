package Day2;

public class CallGuests {
    public static int callGuests(int n){

        if(n <= 1) return 1;

        int ways1 = callGuests(n - 1);

        int ways2 = (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }
}
