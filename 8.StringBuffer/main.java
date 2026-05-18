import java.util.*;
import java.util.Arrays;
import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        //constructor 2
        StringBuffer sb2  = new StringBuffer("Kartik Prajapat");
        
        //constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("WeMakeDevs");
        sb.append("is nice");

        // sb.insert(2,"kaku");

        sb.replace(1, 5, "Prajapat");

        sb.delete(1, 5);

        // sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        //remove whitespace

        String sentence = "Hi i a m kfj kjfjklf lfkg f";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        //Split

        String arr = "Kartik,Dastoor,Ram,Moh";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        //rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.297));


    }
}
