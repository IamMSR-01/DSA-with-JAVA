public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
          System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
          return;   
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 2;
        String src = "Source";
        String dest = "Destination";
        String helper = "Helper";
        towerOfHanoi(n, src, helper, dest);
    }
}