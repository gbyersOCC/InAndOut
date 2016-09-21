package edu.orangecoastcollege.cs273.gbyers.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

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

        String totalOrderString = recievedIntent.getStringExtra("orderTotal");
        String reportTotalString = recievedIntent.getStringExtra("restOfOrder");

        otherReportTextView.setText(reportTotalString);
        totalReportTextView.setText(totalOrderString);

    }

    public void returnToOrder(View view)
    {
        this.finish();
    }
}
