package assignments.Assign3;

import java.util.Scanner;

public class Vowels_Conso {
    public static void main(String[] args) {
        //21. Java Program Vowel Or Consonant
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().toLowerCase();
        char ch = s.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");
    }
}
