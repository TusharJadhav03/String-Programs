package Strings;

import java.util.Scanner;

public class StringEquals {
    
    public boolean equalString(String str1,String str2){
        if(str1.equals(str2))
            return true;
        else
            return false;    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 1st String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter a 2nd String:");
        String str2 = sc.nextLine();

        StringEquals se = new StringEquals();
        System.out.println(se.equalString(str1, str2));

        sc.close();
    }
}
