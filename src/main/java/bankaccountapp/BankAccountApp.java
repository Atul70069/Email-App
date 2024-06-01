package bankaccountapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws IOException {

        //System.out.println("hello world");
        /*Checkings chkacc1= new Checkings("Atul ","321789456",1500);

        Savings savac1= new Savings("OM","123456789",1500);

        savac1.showInfo();
        System.out.println("...............");
        chkacc1.showInfo();
        */


        List<Account> accounts= new LinkedList<Account>();


        String File="C:\\Users\\DELL\\OneDrive\\Desktop\\Master Spring Boot With project\\NewBankAccounts.csv";



        //....read a csv file and create new acoount accoring to tyhe date ....
        List<String[]> newAccountHolders= utilities.CSV.read(File);
        for (String[] accountHolder:newAccountHolders) {


            String name= accountHolder[0];
            String sSN=accountHolder[1];
            String AccountType=accountHolder[2];
            double initDeposit= Double.parseDouble(accountHolder[3]);



            if (AccountType.equals("Savings"))
            {
               accounts.add(new Savings(name,sSN,initDeposit));
            }
            else if (AccountType.equals("Checking"))
            {
                accounts.add(new Checkings(name,sSN,initDeposit));
            }
            else {
                System.out.println("ERROR READING ////");
            }

        }



        for (Account acc: accounts)
        {
            System.out.println("/**********************/");
            acc.showInfo();
        }


    }


}
