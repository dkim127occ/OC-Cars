package edu.orangecoastcollege.cs273.dkim127.occars;

public class Car
{
    private double mDownPayment;
    private double mPrice;
    private int mLoanTerm;
    private static final double TAX_RATE = 0.08;

    public double calculateBorrowedAmount()
    {

    }

    public double calculateInterestAmount()
    {

    }

    public double calculateMonthlyPayment()
    {

    }

    public double calculateTaxAmount()
    {

    }

    public double calculateTotalCost()
    {

    }

    public void setDownPayment(double downPayment)
    {
        mDownPayment = downPayment;
    }

    public void setLoanTerm(int loanTerm)
    {
        mLoanTerm = loanTerm;
    }

    public void setPrice(double price)
    {
        mPrice = price;
    }

    public double getDownPayment()
    {
        return mDownPayment;
    }

    public double getPrice()
    {
        return mPrice;
    }

    public int getLoanTerm()
    {
        return mLoanTerm;
    }
}
