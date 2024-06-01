package bankaccountapp;

public class Savings  extends Account{

    //*********list properties related to saving account

    int safteyDepositBoxID;
    int safetyDepositBoxKey;


    //************constructor to intialize saving properyities
    public Savings(String name,String sSN, double initDeposit)
    {
      super(name,sSN,initDeposit);

      accountNumber= "1"+ accountNumber;

      safetyDepositBox();




        //System.out.println("Account Number= "+accountNumber);
        //System.out.println("New Savings Account  ");
        //System.out.println("Name "+name);
    }

    @Override
    public void setRate() {
       rate= getbaseRate()-.025;
    }

    private void safetyDepositBox()
    {
        safteyDepositBoxID =(int) (Math.random()*Math.pow(10,3));
        safetyDepositBoxKey=(int) (Math.random()*Math.pow(10,4));
    }





    //list any method realted to Savings account

    public void showInfo()
    {
        super.showInfo();
        System.out.println("Your savings Account features =" +
                "\n safety deposit box id = " +safteyDepositBoxID+
                "\n safety deposit box key = "+safetyDepositBoxKey);
    }
}
