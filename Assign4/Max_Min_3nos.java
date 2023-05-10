package assignments.Assign4;

import java.util.Scanner;

public class Max_Min_3nos {
    //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum : " + max(a,b,c));
        System.out.println("Minimum : " + min(a,b,c));
    }

   /* static int max(int x,int y, int z){
        if(x > y && x > z)
            return x;
        else if (y > x && y > z) {
            return y;
        }
        else if (z > x && z > y) {
            return z;
        }
        else{
            if(x == y && y == z)
                return x;
            else if (x == y) {
                return x;
            } else if (x == z) {
                return z;
            }
            else
                return y;
        }
    }

    static int min(int x,int y, int z){
        if(x < y && x < z)
            return x;
        else if (y < x && y < z) {
            return y;
        }
        else if (z < x && z < y) {
            return z;
        }
        else{
            if(x == y && y == z)
                return x;
            else if (x == y) {
                return x;
            } else if (x == z) {
                return z;
            }
            else
                return y;
        }
    }*/

    // Compressed code:
    static int max(int x,int y, int z){
        int maximum = x;
        if(y > maximum)
            maximum = y;
        if(z > maximum)
            maximum = z;
        return maximum;
    }

    static int min(int x,int y, int z){
        int minimum = x;
        if(y < minimum)
            minimum = y;
        if(z < minimum)
            minimum = z;
        return minimum;
    }
}
