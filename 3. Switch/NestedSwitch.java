import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpId = sc.nextInt();
        String Department = sc.next();

        switch (EmpId) {
            case 1:
                System.out.println("Kartik");
                break;

            case 2:
                System.out.println("Ram");
                break;

            case 3:
                System.out.println("This is Employe 3");
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("Management Department");
                        break;
                
                    default:
                        System.out.println("Enter valid input");
                        break;
                }
                break;
        
            default:
                break;
        }
    }
}