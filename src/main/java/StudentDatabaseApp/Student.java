package StudentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstname;
    private  String lastname ;

    private int gradeYear;
    private String StudentId;
    private String cousres="";
    private  int TutionBalance=0;
    private static int costOfcourse=600;

    private static int id=1000;

    //constructor :- user enter name and year
    public Student()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first name");
        this.firstname= sc.nextLine();

        System.out.println("Enter the last name");
        this.lastname= sc.nextLine();


        System.out.println("1 - fresher\n2 - Spohmore\n3 - Junior\n4 - Senior\nEnter the student grade level:");
        this.gradeYear= sc.nextInt();

        setStudentId();

        System.out.println(firstname+" "+lastname+" "+gradeYear+ " "+StudentId);



    }

    //generate Id

    private void setStudentId()
    {
        ++id;
        this.StudentId= gradeYear+""+ id;
    }

    //Enrll in course

    public void enroll() {
        do {

            System.out.println("Enter the course to enrollOR Q to Quit the process");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                cousres = cousres + "\n" + course;
                TutionBalance = TutionBalance + costOfcourse;
            } else {
               // System.out.println("Break!!!!");
                break;
            }

        } while (1 != 0);
        System.out.println("Enrolled IN "+cousres);
        //System.out.println("Tution Balance "+TutionBalance);
    }

    //view balance

    public void viewBalance()
    {
        System.out.println("Yours balance is :- "+TutionBalance);
    }


    //pay tution
    public void payBalance()
    {
        viewBalance();
        System.out.println("Enter Your Payment");
        Scanner sc =new Scanner(System.in);
        int paid=sc.nextInt();
        TutionBalance=TutionBalance-paid;
        System.out.println("Thank You for Your payment of $"+paid);
        viewBalance();

    }


    // show status
    public String toString()
    {
       return "NAME: "+firstname+" "+lastname+
       "\nGrade Level:- "+ gradeYear+
       "\nStudent Id:- "+StudentId+
               "\ncourses:- "+cousres+
               "\nBalance: $"+TutionBalance;
    }





}
