package com.example.sjcet.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);
        result=findViewById(R.id.result);
        btn=findViewById(R.id.add);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;
// set it ot result textview
                result.setText(Double.toString(sum));
            }
        });

    }
}