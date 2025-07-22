import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter range: ");
        int n = sc.nextInt();
        int sp = n;
        for(int i=0; i<n; i++) {
            sp -= 1;
            for(int k = 0; k<sp; k++){
                System.out.print(" ");
            } 
            System.out.print(" ");
            for(int j=0; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
