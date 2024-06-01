package StudentDatabaseApp;

import java.util.Scanner;

public class studentdatabaseApp {

    public static void main(String[] args) {

        //System.out.println("Hello World");


        //Ask how many users need to be added...


        System.out.println("ENTER THE NO OF STUDENT U WANT TO ENROLL:-");
        Scanner scanner=new Scanner(System.in);
        int NoOfstudents=scanner.nextInt();
        Student students [] =new Student[NoOfstudents];


        // create n no of new students.

        for (int n=0;n<NoOfstudents;++n)
        {
           students[n]=new Student();
            students[n].enroll();
            students[n].payBalance();
            System.out.println(students[n].toString());

        }





    }
}
