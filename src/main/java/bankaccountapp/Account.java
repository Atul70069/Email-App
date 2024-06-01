package bankaccountapp;

public abstract class Account implements IBaseRate {

    //LIST Common properties for savings and checking accounts //

    private String name;
   private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
 private    static int index=10000;




    //Constructor to swt prop and intilize account

    public Account(String name,String sSN,double initDeposit)
    {
        this.name=name;
        this.sSN=sSN;
        balance=initDeposit;
       //System.out.println("name="+name+"SSN= "+sSN);

 // ************increment evry time a no is increased********************
       index++;


        this.accountNumber=setAccountNumber();
        setRate();


    }

    public abstract void setRate();

    //***********SET ACCOUNT NOS**********


    private String setAccountNumber()
    {
        String lastTwosSN= sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID=index;
        int randomNumber= (int)(Math.random()*Math.pow(10,3));
        return lastTwosSN+index+randomNumber;
    }


    //list methods transactions...........

    public void compound()
    {
        double accruedIntreset= balance*(rate/100);
        balance=balance+accruedIntreset;
        System.out.println("Accured Intreset : $"+ accruedIntreset);
    printBalance();
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited $ "+ amount);

    }

    public void withdraw(double amount)
    {
        balance=balance-amount;
        System.out.println("Withdrawl $ "+amount);
    }
    public void transfer(String toWhere,double amount)
    {
        balance=balance-amount;
        System.out.println("Transfering $ "+ amount+ " to "+toWhere);
        printBalance();
    }

    public void printBalance()
    {
        System.out.println("Your balance is ="+ balance);
    }

    public void showInfo()
    {
        System.out.println(
                "Name: "+ name+
                        "\nAccount Number: "+accountNumber+
                        "\nBalance: "+ balance+
                "\n Rate "+ rate+" %"
        );
    }



}
