package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        try {
            EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditTextNumber);
            TextView convertedAmount = (TextView) findViewById(R.id.convertedTextView) ;
            String p = dollarAmountEditText.getText().toString();
            Double input = Double.parseDouble(p);
            Double ret = input * 0.78;
            convertedAmount.setText(String.format("%.2f", input) + " dollars = " + String.format("%.2f", ret) + " pounds");
        } catch (NumberFormatException ex) {
            return;
        }
    }

}