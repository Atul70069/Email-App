package bankaccountapp;

public interface IBaseRate {

    //... method return to base rate...//
    default double getbaseRate()
    {
        return  2.5;
    }


}
