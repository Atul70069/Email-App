package emailapp;

import java.util.Scanner;

public class email {

   private String firstName ;
   private String lastname;
    private String password;
    private String department;
    private int mailboxCapacity =500;
    private String alternateEmail;
    private int defaultPassLenghth=10;
    private  String email;
    private  String companySuffix= "tcs.com";




    //constructor to recieve the first and last name
    public email(String firstname,String lastname)
    {
        this.firstName=firstname;
        this.lastname=lastname;
       // System.out.println("Email created: "+ this.firstName+" "+this.lastname);

// call a method asking for the department -> then return the department
        this.department=setDepartment();
       // System.out.println("Department: "+this.department);

 // Call a method that returns a random password..

        this.password=randomPassword(defaultPassLenghth);
        System.out.println("YOUR PASSWORD is: "+ this.password);


// Combine elements to create email
        email = firstname.toLowerCase()+ "."+ lastname.toLowerCase()+ "@"+ department+ "."+companySuffix;
        System.out.println("YOUR EMAIL is: "+ email);



    }


    //ask for the department

    private String setDepartment()
    {
        System.out.print("New Worker: "+ firstName+". Department Codes\n1 for Sales\n2 for development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner sc= new Scanner(System.in);
        int departmentChoise= sc.nextInt();
        if (departmentChoise== 1) return "sales";
        else if (departmentChoise== 2) return "dev";
        else if (departmentChoise == 3) return "accounts";
        else return "";
    }




    //generate a random password

    private String randomPassword(int lenghth)
    {
        String passwordSet= "QWERTYUIOPASDFGHJKLZXCVBNM!@#$%";
        char[] password = new char[lenghth];
        for (int i=0;i<lenghth;++i)
        {
           int rand =(int)(Math.random()*passwordSet.length());
          //  int rand =(int)(Math.random()*Math.random());
            password[i]= passwordSet.charAt(rand);
        }
        return new String(password);
    }



    // set the email mailbox capicity




    //set the alternate email






    //change the password



    public String showinfo()
    {
        return "Display Name: "+firstName+" "+lastname+
                "\nCompany Email: "+ email+
                "\nMailBox Capacity: "+ mailboxCapacity +"MB";
    }

}
