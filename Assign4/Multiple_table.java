package assignments.Assign4;

import java.util.Scanner;

public class Multiple_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Multiplication Table : " + mul_tab(n));
    }

    static String mul_tab(int n){
        String tab = "";
        for(int i = 1; i <= 10; i++){
            tab = tab + "\n" + n + " * " + i + " = " + (n * i);
        }
        return tab;
    }
}
