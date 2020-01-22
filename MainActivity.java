package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  EditText num1 , num2;
  Button sum,res,div,mul;
  TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =(EditText) findViewById(R.id.num1);
        num2 =(EditText) findViewById(R.id.num2);

        sum = (Button) findViewById(R.id.sum);
        res = (Button) findViewById(R.id.res);
        div = (Button) findViewById(R.id.div);
        mul = (Button) findViewById(R.id.mul);
        resultado = (TextView) findViewById(R.id.resultado);
        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        int ent1= Integer.parseInt(n1);
        int ent2= Integer.parseInt(n2);
        int rta =0;

        switch (v.getId()){
            case R.id.sum:
            rta= ent1+ent2;
            break;
            case R.id.res:
                rta= ent1-ent2;
                break;
                case R.id.div:
                    rta= ent1/ent2;
                break;
                case R.id.mul:
                    rta= ent1*ent2;
                break;
        }

        resultado.setText(""+rta);
    }
}
