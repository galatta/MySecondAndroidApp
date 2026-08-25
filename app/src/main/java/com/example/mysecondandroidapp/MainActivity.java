package com.example.mysecondandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.number1);
        n2=findViewById(R.id.number2);
        result=findViewById(R.id.result);
    }

    public void Calculate(View v)
    {
        double num1=Double.parseDouble(n1.getText().toString());
        double num2=Double.parseDouble(n2.getText().toString());
        double r=num1+num2;
        result.setText("The Result is ==> "+r);
    }
}