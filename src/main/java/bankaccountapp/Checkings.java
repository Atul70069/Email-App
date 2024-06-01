package bankaccountapp;

public class Checkings extends Account
{

    //List properties specific to a Checking acoount

    private int debitCardNumber;
   private int debitCardPIN;

    //constructor to intialize checking account properties .
    public Checkings(String Name,String sSN,double initDeposit)
    {
        super(Name,sSN,initDeposit);
        accountNumber= "2"+accountNumber;

        setDebitCard();
        //System.out.println("Account Number= "+accountNumber);
       // System.out.println(" New checking account ");
        //System.out.println("Name: "+Name);
    }

    @Override
    public void setRate() {
       rate= getbaseRate()*.15;
    }

    private void setDebitCard()
   {
       debitCardNumber=(int)(Math.random()*Math.pow(10,12));
       debitCardPIN=(int)(Math.random()*Math.pow(10,4));
   }
    //List any ,ethod specific to checking account
    public void showInfo()
    {
        super.showInfo();
        System.out.println("Your Checking Account Fetures+" +
                "\n Debit card Number " +debitCardNumber+
                "\n Debit card Pin "+ debitCardPIN
        );
    }




}
