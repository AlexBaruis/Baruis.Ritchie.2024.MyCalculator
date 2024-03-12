package com.example.baruis_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cal;
    TextView calculator;
    EditText number1;
    EditText number2;
    Button plus;
    Button minus;
    Button times;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal = (TextView) findViewById(R.id.textView2);
        calculator = (TextView) findViewById(R.id.txt);
        number1 = (EditText) findViewById(R.id.txt1);
        number2 = (EditText) findViewById(R.id.txt2);
        plus = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.sub);
        times = (Button) findViewById(R.id.mul);
        divide = (Button) findViewById(R.id.div);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String input1 = number1.getText().toString();
                //int number = Integer.parseInt(input1);

                double myNum1 = Double.parseDouble(number1.getText().toString());
                double myNum2 = Double.parseDouble(number2.getText().toString());
                double sum = myNum1 + myNum2;


                calculator.setText(String.valueOf(sum));
                //result.setText(""+sum);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(number1.getText().toString());
                double myNum2 = Double.parseDouble(number2.getText().toString());
                double dif = myNum1 - myNum2;

                calculator.setText(String.valueOf(dif));
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double myNum1 = Double.parseDouble(number1.getText().toString());
                double myNum2 = Double.parseDouble(number2.getText().toString());
                double dif = myNum1 * myNum2;

                calculator.setText(String.valueOf(dif));

                divide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        double myNum1 = Double.parseDouble(number1.getText().toString());
                        double myNum2 = Double.parseDouble(number2.getText().toString());
                        double dif = myNum1 / myNum2;

                        calculator.setText(String.valueOf(dif));


                    }
                });


            }
        });
    }
}