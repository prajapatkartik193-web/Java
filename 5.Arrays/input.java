import java.util.*;
public class input {

    public static void primitive() {
        Scanner sc = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 20;

        System.out.println(arr[2]);

        //input using for loops
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        for(int num: arr) {
            System.out.println(num + " ");
        }
    }

    public static void object() {
        //array of object
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "kartik";
        System.out.println(Arrays.toString(str));
    }
    public static void main(String[] args)  {
        // primitive();
        object();

    }
}