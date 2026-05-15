public class Shadowing {
    
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x); // 100
        int x = 10;
        System.out.println(x); //10
    }
    static void fun() {
        System.out.println(x); //100
    }
}
