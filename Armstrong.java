import java.util.*;
public class Armstrong {
    public static void main(String args[]) {
        int  copy, dig, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        copy = num;
        while(copy > 0) {
            dig = copy%10;
            copy = copy/10;
            sum += dig * dig * dig;
        }
        if(num == sum) {
            System.out.println(num + " is a Armstrong Number.");
        }
        else {
            System.out.println(num + " is not a Armstrong Number.");


        }
    }
}
