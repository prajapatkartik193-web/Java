public class Overloading {
    public static void main(String[] args) {
        fun(10);
        fun("kartik");
    }

    static void fun(int x) {
        System.out.println(x);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
