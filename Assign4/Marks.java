package assignments.Assign4;

import java.util.Scanner;

public class Marks {
    //Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
    //<pre>
    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail
    //</pre>

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        System.out.println("Grade : " + grade(marks));
    }

    static String grade(int m){
        if(m >= 91 && m <= 100)
            return "AA";
        else if(m >= 81 && m <= 90)
            return "AB";
        else if(m >= 71 && m <= 80)
            return  "BB";
        else if(m >= 61 && m <= 70)
            return  "BC";
        else if(m >= 51 && m <= 60)
            return  "CD";
        else if(m >= 41 && m <= 50)
            return  "DD";
        else if(m <= 40)
            return "Fail";
        else
            return "Enter valid marks(0-100)";
    }
}
