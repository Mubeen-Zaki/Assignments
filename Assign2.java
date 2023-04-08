import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
//        1. Write a program to print whether a number is even or odd, also take
//        input from the user.
        /*System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");*/

//        2. Take name as input and print a greeting message for that particular name.
        /*System.out.println("Enter name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", a very good morning");*/

//        3. Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.
        /*System.out.println("Enter principal, time, rate:");
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float t = sc.nextFloat();
        float r = sc.nextFloat();
        float si = (p * t * r) / 100;
        System.out.println(si);*/

//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//        (Use if conditions)
        /*System.out.println("Enter 1st num :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter op(+,-,*,/):");
        String op = sc.next();
        System.out.println("Enter 2nd num:");
        int b = sc.nextInt();
        if(op.charAt(0) == '+'){
            System.out.println(a + b);
        }
        else if (op.charAt(0) == '-') {
            System.out.println(a - b);
        }
        else if (op.charAt(0) == '*') {
            System.out.println(a * b);
        }
        else if (op.charAt(0) == '/') {
            System.out.println(a / b);
        }
        else {
            System.out.println("Invalid operation");
        }*/

//        5. Take 2 numbers as input and print the largest number.
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
            System.out.println("Largest number : " + a);
        else if (a < b)
            System.out.println("Largest number : " + b);
        else
            System.out.println("Equal");*/

//        6. Input currency in rupees and output in USD.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees : ");
        int rupees = sc.nextInt();
        float usd = rupees * 0.012f;
        System.out.println("USD : " + usd);*/

//        7. To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter n for fibo series:");
        int n = sc.nextInt();
        int[] f = new int[n];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i < n; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        for(int i = 0; i < n; i++){
            System.out.println(f[i]);
        }*/

//        8. To find out whether the given String is Palindrome or not.
       /* String str = sc.nextLine();
        int f = 0;
        for(int i = 0, j = str.length() - 1; i < str.length() ; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a palindrome!");
                f = 1;
                break;
            }
        }
        if(f == 0)
            System.out.println("Palindrome!");*/

//        9. To find Armstrong Number between two given number.
        /*int n = sc.nextInt();
        int num = n;
        int s = 0,r = 0;
        while (n != 0){
            r = n % 10;
            n = n / 10;
            s = s + (r * r * r);
        }
        if(num == s)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an armstrong number");*/

    }
}
