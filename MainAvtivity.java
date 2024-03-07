package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View e){
        EditText input1 = findViewById(R.id.number1);
        EditText input2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        String textInput1 = input1.getText().toString();
        String textInput2 = input2.getText().toString();
        float num1 = Float.parseFloat(textInput1);
        float num2 = Float.parseFloat(textInput2);
        float numResult = num1 + num2;
        result.setText(""+ numResult);
    }

    public void substaction(View e){
        EditText input1 = findViewById(R.id.number1);
        EditText input2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        String textInput1 = input1.getText().toString();
        String textInput2 = input2.getText().toString();
        float num1 = Float.parseFloat(textInput1);
        float num2 = Float.parseFloat(textInput2);
        float numResult = num1 - num2;
        result.setText(""+ numResult);
    }

    public void division(View e){
        EditText input1 = findViewById(R.id.number1);
        EditText input2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        String textInput1 = input1.getText().toString();
        String textInput2 = input2.getText().toString();
        float num1 = Float.parseFloat(textInput1);
        float num2 = Float.parseFloat(textInput2);
        float numResult = num1 / num2;
        result.setText(""+ numResult);
    }

    public void multiplication(View e){
        EditText input1 = findViewById(R.id.number1);
        EditText input2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        String textInput1 = input1.getText().toString();
        String textInput2 = input2.getText().toString();
        float num1 = Float.parseFloat(textInput1);
        float num2 = Float.parseFloat(textInput2);
        float numResult = num1 * num2;
        result.setText(""+ numResult);
    }

    public void reset(View e){
        EditText input1 = findViewById(R.id.number1);
        EditText input2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        input1.setText("");
        input2.setText("");
        result.setText("result");
    }
}
