package assignments.Assign3;

import java.util.Scanner;

public class Depriciation {
    public static void main(String[] args) {
        //8. Calculate Depreciation of Value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter asset value:");
        int asset_val = sc.nextInt();
        System.out.println("Enter salvage :");
        int salvage = sc.nextInt();
        System.out.println("Enter Depriciation years:");
        int years = sc.nextInt();
        float depreciation_val = (asset_val - salvage) / years; // straight line method
        System.out.println(depreciation_val);
    }
}
