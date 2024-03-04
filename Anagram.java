package Strings;

import java.util.Scanner;

public class Anagram {

    public boolean isBoolean(String a,String b){

        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length())
        return false;

        int arr[] = new int[26];
        for(int i=0;i<a.length();i++){
            int index = a.charAt(i) - 'a';
            arr[index]++;
        }

        for(int i=0;i<b.length();i++){
            int index = b.charAt(i) - 'a';
            arr[index]--;
        }

        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Anagram an = new Anagram();
        System.out.println(an.isBoolean(a, b));
        

        sc.close();
    }
}
