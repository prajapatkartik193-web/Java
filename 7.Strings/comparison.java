public class comparison {
    public static void main(String[] args) {
        String a = "kartik";
        String b = "kartik";
        String c = "a";
        System.out.println(c == a);

        System.out.println(a == b);

        String name1 = new String("Kartik");
        String name2 = new String("Kartik");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}
