package assignments.Assign3;

import java.util.Scanner;

public class Distance_bw_pts {
    public static void main(String[] args) {
        //5. Calculate Distance Between Two Points
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println((float)distance);
    }
}
