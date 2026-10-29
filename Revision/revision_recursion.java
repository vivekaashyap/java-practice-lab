
public class revision_recursion {

    public static void dp(int n) {
        if (n == 0) {
            return;
        }
        dp(n-1);
        System.out.print(n + " "); 
    }
    
    public static void increasing(int n) {
        if (n == 0) {
            return;
        }
        increasing(n-1);
        System.out.print(n + " "); 
    }

    public static int fact(int x){
        if(x == 0) return 1;
        return fact(x-1) * x;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
