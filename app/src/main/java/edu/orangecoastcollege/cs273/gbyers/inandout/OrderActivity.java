package edu.orangecoastcollege.cs273.gbyers.inandout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;

public class OrderActivity extends Activity {

    NumberFormat currency = NumberFormat.getCurrencyInstance();


    private EditText cheeseburgerEdit;
    private EditText doubleEdit;
    private EditText shakeEdit;
    private EditText fryEdit;
    private EditText fountainSmallEdit;
    private EditText fountainMediumEdit;
    private EditText fountainLargeEdit;
    private Button orderButton;

    private Order orderOne;

    //two strings for Intent
    String orderTotalString;
    String orderTaxString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        doubleEdit = (EditText) findViewById(R.id.doubleEdit);
        cheeseburgerEdit = (EditText) findViewById(R.id.cheeseburgerEdit);
        fryEdit = (EditText) findViewById(R.id.frenchFryEdit);
        shakeEdit = (EditText) findViewById(R.id.shakeEdit);
        fountainSmallEdit = (EditText) findViewById(R.id.smallEdit);
        fountainMediumEdit = (EditText) findViewById(R.id.mediumEdit);
        fountainLargeEdit = (EditText) findViewById(R.id.largeEdit);
        orderButton = (Button) findViewById(R.id.orderButton);

        orderOne = new Order();

    }

    public void activateOrderSummary(View view) {
        //all Editables must be toString() then parsed to Double Wrapper
        int doubleOrder, cheeseburgerOrder, fryOrder, shakeOrder, smallOrder, mediumOrder, largeOrder;

        try {
            doubleOrder = Integer.parseInt(doubleEdit.getText().toString());
            cheeseburgerOrder = Integer.parseInt(cheeseburgerEdit.getText().toString());
            fryOrder = Integer.parseInt(fryEdit.getText().toString());
            shakeOrder = Integer.parseInt(shakeEdit.getText().toString());
            smallOrder = Integer.parseInt(fountainSmallEdit.getText().toString());
            mediumOrder = Integer.parseInt(fountainMediumEdit.getText().toString());
            largeOrder = Integer.parseInt(fountainLargeEdit.getText().toString());

        } catch (NumberFormatException e) {
            doubleOrder = 0;
            cheeseburgerOrder = 0;
            fryOrder = 0;
            shakeOrder = 0;
            smallOrder = 0;
            mediumOrder = 0;
            largeOrder = 0;
        }

        orderOne.setDoubleBurger(doubleOrder);
        orderOne.setCheeseBurger(cheeseburgerOrder);
        orderOne.setFries(fryOrder);
        orderOne.setShakes(shakeOrder);
        orderOne.setFountainLow(smallOrder);
        orderOne.setFountainMed(mediumOrder);
        orderOne.setFountainHi(largeOrder);

        //Intent(this, destination)
        Intent orderSummaryIntent = new Intent(this, SummaryActivity.class);

        orderSummaryIntent.putExtra("orderTotal", orderTotalString);

        orderSummaryIntent.putExtra("restOfOrder", orderTaxString);

         constructOrderSummary();

        startActivity(orderSummaryIntent);

    }

    private void constructOrderSummary()
    {
    //make order total string
        orderTotalString = getString(R.string.total_report)+ currency.format(orderOne.getTotalAmount());
    //make the rest of the report in one string
        orderTaxString = getString(R.string.items_report)+ orderOne.getTotalQty()+ getString(R.string.subtotal_report)+
                         orderOne.getSubtotalPrice()+ getString(R.string.tax_report)+ currency.format(orderOne.getTax());
    }


}
