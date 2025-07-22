import java.util.*;
public class Fibonacci {
    public static void fibo(int n) {
        long f1 = -1, f2 = 1, f3;
        for(int i=0; i<n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        fibo(n);
    }
}
