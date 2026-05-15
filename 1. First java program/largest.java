import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // int max = a;

        // if (b > max) {
        //     System.out.println(max=b);
        // }
        // if (c > max) {
        //     System.out.println(max=c);
        // }
        // System.out.println(max);

        // int max = 0;
        
        // if (a > b) {
        //     max = a;
        // }
        // else if (b > c) {
        //     max = b;
        // }
        
        // if (c > max) {
        //     max = c;
        // }
        // System.out.println(max);

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
