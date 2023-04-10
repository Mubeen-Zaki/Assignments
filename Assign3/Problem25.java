package assignments.Assign3;

public class Problem25 {
    public static void main(String[] args) {
        //25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        int total_days = 31;
        int hangouts = 0;
        for(int i = 1; i <= total_days; i++){
            if(i % 2 == 0)
                hangouts ++;
        }
        System.out.println(hangouts);
    }
}
