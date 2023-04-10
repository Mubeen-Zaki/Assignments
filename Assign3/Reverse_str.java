package assignments.Assign3;

import java.util.Scanner;

public class Reverse_str {
    public static void main(String[] args) {
        //16. Reverse A String In Java
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
