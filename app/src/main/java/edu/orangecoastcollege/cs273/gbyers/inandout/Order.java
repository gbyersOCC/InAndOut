package edu.orangecoastcollege.cs273.gbyers.inandout;

/**
 * @author Grant Byers 9/16/206
 */
public class Order {
    //Tax Constant is 8%
    private static final double TAX = .08;
    private static final double PRICE_DOUBLE_DOUBLE = 3.60,  PRICE_CHEESE_BURGER =2.15, PRICE_FRENCH_FRIES = 1.65;
    private static final double PRICE_SHAKES = 2.20, PRICE_LARGE_DRINK = 1.75, PRICE_MEDIUM_DRINK = 1.55, PRICE_SMALL_DRINK = 1.45;

    private int mTotalQty;
    private double mTotalPrice;
    private double taxAmount;
    private int mCheeseburger;
    private int mDoubleDouble;
    private int mFrenchFries;
    private int mLargeDrink;
    private int mMediumDrink;
    private int mSmallDrink;
    private int mShake;

    public int getShake() {
        return mShake;
    }

    public void setShake(int qty) {
        this.mShake = qty;
        mTotalQty += qty;
        mTotalPrice += qty * PRICE_SHAKES;

    }

    public int getSmallDrink() {
        return mSmallDrink;
    }

    public void setSmallDrink(int qty) {
        this.mSmallDrink =qty;
        mTotalQty += qty;
        mTotalPrice += qty * PRICE_SMALL_DRINK;
    }

    public int getMediumDrink() {
        return mMediumDrink;
    }

    public void setMediumDrink(int qty) {
        this.mMediumDrink = qty;
        mTotalQty += qty;
        mTotalPrice+= qty * PRICE_MEDIUM_DRINK;
    }

    public int getLargeDrink() {
        return mLargeDrink;
    }

    public void setLargeDrink(int qty) {
        this.mLargeDrink = qty;
        mTotalQty += qty;
        mTotalPrice += qty * PRICE_LARGE_DRINK;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public void setFrenchFries(int qty) {
        this.mFrenchFries = qty;
        mTotalQty+=qty;
        mTotalPrice+= PRICE_FRENCH_FRIES*qty;
    }

    public int getDoubleDouble() {
        return mDoubleDouble;
    }

    public void setDoubleDouble(int qty) {
        this.mDoubleDouble = qty;
        mTotalQty+=qty;
        mTotalPrice+= PRICE_DOUBLE_DOUBLE*qty;
    }

    public int getCheeseburger() {
        return mCheeseburger;
    }

    public void setCheeseburger(int qty) {
        this.mCheeseburger = qty;
        mTotalQty+=qty;
        mTotalPrice+= PRICE_CHEESE_BURGER*qty;

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



    public double getTax()
    {
        taxAmount = mTotalPrice * TAX;
        return taxAmount;
    }

}
