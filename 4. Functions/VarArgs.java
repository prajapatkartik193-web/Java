import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(10,20,30,4,0);
        multiple(10, 20,"kartik","kaku");
    }   
    
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b,String ...v) {
        System.out.println(Arrays.toString(v));
    }
}