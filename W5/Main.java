import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
     
        
    Scanner sc = new Scanner(System.in); {   
    //String N = sc.nextLine();
    //String container = sc.nextLine();
    //String drink = sc.nextLine();


    String a = sc.nextLine();
    String[] words = a.split(" ");

    String N = (String) Array.get(words, 0);
    String container = (String) Array.get(words, 1);
    String drink = (String) Array.get(words, 3);

    int n = Integer.parseInt(N);



    //System.out.println("amount " + N);
    //System.out.println("container " + container);
    //System.out.println("drink " + drink);

   

    for (int i = n; i > 0; i--) {

        String line1 = i + " "+ container+" of "+ drink+" on the wall";
        String line2 = i + " "+ container+" of "+ drink;
        String line3 = "Take one down, pass it around";
        String line4 = i-1 + " "+ container+" of "+ drink+" on the wall";

        if (i == 2) {

            String container2 = container.substring(0, container.length()-1);

            line1 = i + " "+ container+" of "+ drink+" on the wall";
            line2 = i + " "+ container+" of "+ drink;
            line3 = "Take one down, pass it around";
            line4 = "One " + container2+" of "+ drink+" on the wall";

                }
        
        if (i == 1) {

            String container2 = container.substring(0, container.length()-1);

            line1 ="One "+ container2+" of "+ drink+" on the wall";
            line2 = "One " + " "+ container2+" of "+ drink;
            line3 = "Take one down, pass it around";
            line4 = "No more" + " "+ container+" of "+ drink+" on the wall";

                }
        
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println();

            }
        }
    }    
}
