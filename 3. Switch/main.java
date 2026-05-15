import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "pratham":
                System.out.println("At Shakti pump");
                break;

            case "kush":
                System.out.println("At Google");
                break;
        
            default :
                System.out.println("please enter valid name");
                break;
        }
    }
}