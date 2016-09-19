package edu.orangecoastcollege.cs273.gbyers.inandout;

/**
 * @author Grant Byers 9/16/206
 */
public class Order {
    //Tax Constant is 8%
    private static final double TAX = .08;
    private static final double DOUBLE_BURGER = 3.60,  CHEESE_BURGER =2.15, FRIES = 1.65;
    private static final double SHAKES = 2.20, FOUNTAIN_HI = 1.75, FOUNTAIN_MED = 1.55, FOUNTAIN_LOW = 1.45;

    private int mTotalQty;
    private double mTotalPrice;
    private double taxAmount;

    public Order()
    {
        //initialize member variables to zero
        mTotalPrice = 0;
        mTotalQty = 0;
    }

    public int getTotalQty() {
        return mTotalQty;
    }

    public double getSubtotalPrice() {
        return mTotalPrice;
    }

    public double getTotalAmount()
    {
        return (taxAmount + mTotalPrice);
    }


    public void setDoubleBurger(int qty)
    {
        setCycle(qty, DOUBLE_BURGER);
    }

    public void setCheeseBurger(int qty)
    {

        setCycle(qty, CHEESE_BURGER);
    }
    public void setFries(int qty)
    {
       setCycle(qty, FRIES);
    }
    public void setShakes(int qty)
    {
        setCycle(qty, SHAKES);
    }
    public void setFountainHi(int qty)
    {
        setCycle(qty,FOUNTAIN_HI);
    }
    public void setFountainMed(int qty)
    {
        setCycle(qty, FOUNTAIN_MED);
    }
    public void setFountainLow(int qty)
    {
        setCycle(qty, FOUNTAIN_LOW);
    }
   private void setCycle(int qty, double item)
    {
        mTotalQty+=qty;
        for(int i=0; i<qty; i++)
        {
            mTotalPrice+=item;
        }
    }

    public double getTax()
    {
        taxAmount = mTotalPrice * TAX;
        return taxAmount;
    }

}
