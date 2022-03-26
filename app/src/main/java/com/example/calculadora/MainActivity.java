package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnSoma, btnMenos, btnMult, btnDiv, btnCleanY, btnCleanCal, btnEqual;
    TextView txtY;
    String txtYV;
    int numDig;
    float X,Y;
    int numOperation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnCleanY = (Button) findViewById(R.id.btnCleanY);
        btnCleanCal = (Button) findViewById(R.id.btnCleanCal);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        txtY = (TextView) findViewById(R.id.textY);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig1) {
                numDig = 1;
                painel();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig2) {
                numDig = 2;
                painel();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig3) {
                numDig = 3;
                painel();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig4) {
                numDig = 4;
                painel();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig5) {
                numDig = 5;
                painel();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig6) {
                numDig = 6;
                painel();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig7) {
                numDig = 7;
                painel();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig8) {
                numDig = 8;
                painel();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig9) {
                numDig = 9;
                painel();
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View dig10) {
                numDig = 10;
                painel();
            }
        });
        btnCleanY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cleanY) {
                numDig = 77;
                painel();
            }
        });
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View soma) {
                numDig = 22;
                painel();
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View subt) {
                numDig = 33;
                painel();
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View mult) {
                numDig = 44;
                painel();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View div) {
                numDig = 55;
                painel();
            }
        });
        btnCleanCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View fullClear) {
                numDig = 777;
                painel();
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View resultado) {
                numDig = 999;
                painel();
            }
        });


    }

    private void painel()
    {
    txtYV =  (String) txtY.getText();
    int txtInt = 99;

        if(numDig == 1) //DIGITA 1
        {
            if(txtYV == ""){
                txtInt = 1;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 1;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 2) //DIGITA 2
        {
            if(txtYV == ""){
                txtInt = 2;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 2;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 3) //DIGITA 3
        {
            if(txtYV == ""){
                txtInt = 3;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 3;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 4) //DIGITA 4
        {
            if(txtYV == ""){
                txtInt = 4;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 4;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 5) //DIGITA 5
        {
            if(txtYV == ""){
                txtInt = 5;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 5;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 6) //DIGITA 6
        {
            if(txtYV == ""){
                txtInt = 6;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 6;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 7) //DIGITA 7
        {
            if(txtYV == ""){
                txtInt = 7;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 7;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 8) //DIGITA 8
        {
            if(txtYV == ""){
                txtInt = 8;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 8;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 9) //DIGITA 9
        {
            if(txtYV == ""){
                txtInt = 9;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 9;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 10) //DIGITA 0
        {
            if(txtYV == ""){
                txtInt = 0;
                txtYV = Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
            else{
                txtInt = 0;
                txtYV = txtYV + Integer.toString(txtInt);
                txtY.setText(txtYV);
            }
        }
        else if(numDig == 77)// APAGA A TELA
        {
            txtY.setText(null);
        }
        else if(numDig == 777)// Zera Calculadora
        {
            X = 0;
            txtY.setText(null);
        }
        else if(numDig == 22)//operaçao de soma
        {
            numOperation = 1;
            X = Float.parseFloat((String) txtY.getText());
            txtY.setText("");
        }
        else if(numDig == 33)//operaçao de subtração
        {
            numOperation = 2;
            X = Float.parseFloat((String) txtY.getText());
            txtY.setText("");
        }
        else if(numDig == 44)//operaçao de multiplicação
        {
            numOperation = 3;
            X = Float.parseFloat((String) txtY.getText());
            txtY.setText("");
        }
        else if(numDig == 55)//operaçao de divisão
        {
            numOperation = 4;
            X = Float.parseFloat((String) txtY.getText());
            txtY.setText("");
        }
        else if(numDig == 999)//Resultado
        {
            if(numOperation == 1)
            {
                Y = Float.parseFloat((String) txtY.getText());
                txtY.setText(Integer.toString(Math.round(X) + Math.round(Y)));
            }
            else if(numOperation == 2)
            {
                Y = Float.parseFloat((String) txtY.getText());
                txtY.setText(Integer.toString(Math.round(X) - Math.round(Y)));
            }
            else if(numOperation == 3)
            {
                Y = Float.parseFloat((String) txtY.getText());
                txtY.setText(Integer.toString(Math.round(X) * Math.round(Y)));
            }
            else if(numOperation == 4)
            {
                Y = Float.parseFloat((String) txtY.getText());
                txtY.setText(Integer.toString(Math.round(X) / Math.round(Y)));
            }
        }
    }

}