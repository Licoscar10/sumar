package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText n1,n2;
TextView resulta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        resulta=findViewById(R.id.result);

    }


    public void sumar(View v){
        int a,b,r;
        a=Integer.parseInt(n1.getText().toString());
        b=Integer.parseInt(n2.getText().toString());
        r=a+b;
        resulta.setText(r+"");

    }

}