package com.sjsu.priteshchandaliya.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button buttonAdd,buttonSubstract,buttonDivide,buttonMultiply;
    private TextView resultOutput;

    private EditText etfirst,etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        buttonAdd =(Button)findViewById(R.id.buttonAdd);
        buttonSubstract = (Button)findViewById(R.id.buttonSubstract);
        buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
        etfirst = (EditText)findViewById(R.id.firstNumber);
        etsecond =(EditText)findViewById(R.id.secondNumber);
        resultOutput = (TextView)findViewById(R.id.resultOutput);

        buttonAdd.setOnClickListener(this);
        buttonSubstract.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();

        if (num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0)
        {
            resultOutput.setText("Please enter a valid number");
        }
        else {

            switch (view.getId()) {
                case R.id.buttonAdd:
                    try {
                        int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                        resultOutput.setText(String.valueOf(addition));
                    } catch (Exception e){
                     resultOutput.setText("Please provide valid integer numbers");
                    }
                    break;
                case R.id.buttonSubstract:
                    try{
                    int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                    resultOutput.setText(String.valueOf(subtraction));
            } catch (Exception e){
                resultOutput.setText("Please provide valid integer numbers");
            }
                    break;
                case R.id.buttonDivide:
                    try {
                        int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                        resultOutput.setText(String.valueOf(division));
                    } catch (Exception e) {
                        resultOutput.setText("Cannot DIVIDE!");
                    }
                    break;
                case R.id.buttonMultiply:
                    try{
                    int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                    resultOutput.setText(String.valueOf(multiply));
                    } catch (Exception e){
                        resultOutput.setText("Please provide valid integer numbers");
                    }
                    break;
            }
        }
    }
}