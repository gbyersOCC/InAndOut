package edu.orangecoastcollege.cs273.gbyers.inandout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends Activity {

    private TextView otherReportTextView;
    private TextView totalReportTextView;
    private Button orderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        otherReportTextView = (TextView) findViewById(R.id.otherReportTextView);
        totalReportTextView = (TextView) findViewById(R.id.orderTotalTextView);
        orderButton = (Button) findViewById(R.id.toOrderButton);

        //Declare Intent from other activity using getIntent()
        Intent recievedIntent = getIntent();

        String totalOrderString = recievedIntent.getStringExtra("orderTotalString");
        totalReportTextView.setText(totalOrderString);

        String reportTotalString = recievedIntent.getStringExtra("restOfOrder");
        otherReportTextView.setText(reportTotalString);


    }

    public void returnToOrder(View view)
    {
        this.finish();
    }
}
