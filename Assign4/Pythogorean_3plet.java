package assignments.Assign4;

import java.util.Scanner;

public class Pythogorean_3plet {
    public static void main(String[] args) {
        //Write a function to check if a given triplet is a Pythagorean triplet or not
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        if(isPyth(arr))
            System.out.println("Pythagorean Triplet");
        else
            System.out.println("Not Pythagorean Triplet");
    }

    static boolean isPyth(int[] a){
        int max = Math.max(Math.max(a[0],a[1]),a[2]);
        if(Math.pow(max,2) == Math.pow(a[0],2) + Math.pow(a[1],2) + Math.pow(a[2],2) - Math.pow(max,2))
            return true;
        return false;
    }
}
