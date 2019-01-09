package com.example.asus.mycalculator;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    public TextView tview,tviewdown,tviewup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
       tview = (TextView) findViewById(R.id.tview);
        tviewdown =(TextView) findViewById(R.id.tviewdown);
        tviewup =(TextView) findViewById(R.id.tviewup);

        getSupportActionBar().hide();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }



    public void calculate(View v)
    {

        switch (v.getId())
        {
            case R.id.one:
                tviewup.setText("one");
                break;
            case R.id.two:
                tviewdown.setText("two");
                break;
            case R.id.three:
                tviewup.setText("three");
                break;
            case R.id.four:
                tviewdown.setText("four");
                break;
            case R.id.five:
                tviewup.setText("five");
                break;
            case R.id.six:
                tviewdown.setText("six");
                break;
            case R.id.seven:
                tviewup.setText("seven");
                break;
            case R.id.eight:
                tviewdown.setText("eight");
                break;
            case R.id.nine:
                tviewup.setText("nine");
                break;
            case R.id.zero:
                tviewdown.setText("zero");
                break;

        }

    }

}
