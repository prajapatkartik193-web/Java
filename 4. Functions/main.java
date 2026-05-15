import java.util.*;
public class main {
    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.println(ans);
        int ans = Sum3(20, 50);
        System.out.println(ans);
    }
    
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no a : ");
        int a = sc.nextInt();

        System.out.println("Enter no b : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of the no : " +sum);
    }


    //return type function
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no a : ");
        int a = sc.nextInt();

        System.out.println("Enter no b : ");
        int b = sc.nextInt();

        int sum = a + b;
        return sum;
        //after return type any code will not execute
    }

    //with return type and pass the value
    static int Sum3(int a, int b) {
            int sum = a + b;
            return sum;
        }
}