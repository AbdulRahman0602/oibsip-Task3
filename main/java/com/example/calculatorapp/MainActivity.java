package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }package com.example.collegecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdot,bequal,bclear;
        EditText editText;
        int n1,n2;
        String opr;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            b1=findViewById(R.id.btn1);
            b2=findViewById(R.id.btn2);
            b3=findViewById(R.id.btn3);
            b4=findViewById(R.id.btn4);
            b5=findViewById(R.id.btn5);
            b6=findViewById(R.id.btn6);
            b7=findViewById(R.id.btn7);
            b8=findViewById(R.id.btn8);
            b9=findViewById(R.id.btn9);
            b0=findViewById(R.id.btn0);
            editText=findViewById(R.id.n1);
            badd=findViewById(R.id.btnadd);
            bsub=findViewById(R.id.btnsub);
            bmul=findViewById(R.id.btnmul);
            bdiv=findViewById(R.id.btndiv);
            bdot=findViewById(R.id.btndot);
            bequal=findViewById(R.id.btnequal);
            bclear=findViewById(R.id.btnclear);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b1.getText().toString());
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+(b2.getText().toString()));
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b3.getText().toString());
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b4.getText().toString());
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b5.getText().toString());
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b6.getText().toString());
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b7.getText().toString());
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b8.getText().toString());
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b9.getText().toString());
                }
            });
            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editText.setText((editText.getText())+b0.getText().toString());
                }
            });
            bclear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText("");
                }
            });
            badd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n1=Integer.parseInt(editText.getText().toString());
                    opr="add";
                    editText.setText(null);
                }
            });
            bsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n1=Integer.parseInt(editText.getText().toString());
                    opr="sub";
                    editText.setText(null);
                }
            });
            bmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n1=Integer.parseInt(editText.getText().toString());
                    opr="mul";
                    editText.setText(null);
                }
            });
            bdiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n1=Integer.parseInt(editText.getText().toString());
                    opr="div";
                    editText.setText(null);
                }
            });
            bequal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n2=Integer.parseInt(editText.getText().toString());
                    switch(opr)
                    {
                        case "add":
                            editText.setText((n1+n2)+"");
                            break;
                        case "sub":
                            editText.setText(n1-n2+"");
                            break;
                        case "mul":
                            editText.setText(n1*n2+"");
                            break;
                        case "div":
                            editText.setText(n1/n2+"");
                            break;

                    }
                }
            });









        }
    }
}