import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = Name();
        // System.out.println(message);

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String personlizaed = myGreet(name);
        System.out.println(personlizaed);

    }
    
    static String Name() {
        String greeting = "how are you";
        return greeting;
    }

    static String myGreet(String Name) {
        String message = "Hello" + Name;
        return message;
    }
}
