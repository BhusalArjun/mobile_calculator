package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView inputText, outputText;
    private String input, output, newOutput;

    private Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonAdd, buttonMultiply, buttonSubs, buttonDivision, buttonPoint,
            buttonPercent, buttonPower, buttonEqual, buttonClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = findViewById(R.id.input_text);
        outputText = findViewById(R.id.output_text);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonAdd=findViewById(R.id.addition_btn);
        buttonMultiply=findViewById(R.id.multiply_btn);
        buttonSubs=findViewById(R.id.substraction_btn);
        buttonDivision=findViewById(R.id.division_btn);
        buttonPoint = findViewById(R.id.btnpoint);
        buttonPower = findViewById(R.id.power_btn);
        buttonEqual = findViewById(R.id.equal_btn);
        buttonPercent = findViewById(R.id.percent_btn);
        buttonClear = findViewById(R.id.clear_btn);
    }
}