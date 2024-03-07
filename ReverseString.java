package Bridgelabz;
import java.util.*;
/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        
        // StringBuffer str = new StringBuffer("Tushar");
        // System.out.println(str.reverse());
        // StringBuilder str = new StringBuilder("Tushar");
        // System.out.println(str.reverse());
        int l;
        
        String s;
        String r ="" ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        s= sc.nextLine();
        l = s.length();

        for(int i=l-1;i>=0;i--){
            r = r+s.charAt(i);
        }
        System.out.println(r);
        sc.close();
    }   
}
