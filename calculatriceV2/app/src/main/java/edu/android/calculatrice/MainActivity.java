package edu.android.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnPoint, btnModulo, btnMultiplication, btnSoustraction, btnAddition, btnDivision, btnEqual,
            btnRacine, btnClearAll,btnRapport,btnNegatif;
    TextView TvOutput;
    String process;

    boolean ADD,SUB,MULT,DIV,Remainder,RAS;
    boolean hasDot= false;
    private double Res1,Res2;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.boutonZero);
        btn1 = findViewById(R.id.boutonUn);
        btn2 = findViewById(R.id.boutonDeux);
        btn3 = findViewById(R.id.boutonTrois);
        btn4 = findViewById(R.id.boutonQuatre);
        btn5 = findViewById(R.id.boutonCinq);
        btn6 = findViewById(R.id.boutonSix);
        btn7 = findViewById(R.id.boutonSept);
        btn8 = findViewById(R.id.boutonHuit);
        btn9 = findViewById(R.id.boutonNeuf);
        btnMultiplication = findViewById(R.id.boutonMultiplication);
        btnSoustraction = findViewById(R.id.boutonSoustraction);
        btnAddition = findViewById(R.id.boutonAddition);
        btnDivision = findViewById(R.id.boutonDivision);
        btnClearAll = findViewById(R.id.boutonClearAll);
        ImageButton btnBack = (ImageButton)findViewById(R.id.boutonBack);
        btnRacine = findViewById(R.id.boutonRacine);
        btnEqual = findViewById(R.id.boutonEqual);
        btnPoint = findViewById(R.id.boutonPoint);
        btnModulo = findViewById(R.id.boutonModulo);
        btnNegatif = findViewById(R.id.boutonNegatif);
        btnRapport = findViewById(R.id.boutonRapport);

        TvOutput =findViewById((R.id.TvOutput));


        btnClearAll.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(" ");
            }

        });

        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "0");
            }

        });

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "1");
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "2");
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "3");
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "4");
            }

        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "5");
            }

        });

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "6");
            }

        });

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "7");
            }

        });

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "8");
            }

        });

        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                process = TvOutput.getText().toString();
                TvOutput.setText(process + "9");
            }

        });

        //LES CALCULS

        btnAddition.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
        if (TvOutput == null){
            TvOutput.setText(" ");
        }else{
            Res1 = Double.parseDouble(TvOutput.getText()+" ");
            ADD = true;
            TvOutput.setText(null);
        }

            }

        });
        btnSoustraction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TvOutput == null){
                    TvOutput.setText(" ");
                }else{
                    Res1 = Double.parseDouble(TvOutput.getText()+" ");
                    SUB = true;
                    TvOutput.setText(null);
                }
            }
        });


        btnMultiplication.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TvOutput == null){
                    TvOutput.setText(" ");
                }else{
                    Res1 = Double.parseDouble(TvOutput.getText()+" ");
                    MULT = true;
                    TvOutput.setText(null);
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TvOutput == null){
                    TvOutput.setText(" ");
                }else{
                    Res1 = Double.parseDouble(TvOutput.getText()+" ");
                    DIV = true;
                    TvOutput.setText(null);
                }
            }

        });

        btnPoint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               if (!hasDot){
                   if(TvOutput.getText().equals("")){
                       TvOutput.setText("0.");
                   }else{
                       TvOutput.setText(TvOutput.getText()+".");
                   }

               }
            }

        });
        btnModulo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TvOutput.getText().length() != 0) {
                   Res1 = Double.parseDouble(TvOutput.getText() + "");
                    Remainder = true;
                    TvOutput.setText(null);
                }
            }

        });

        btnEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
         Res2 = Double.parseDouble(TvOutput.getText()+" ");
                if (ADD == true){
                  TvOutput.setText(Res1 + Res2 +" ");
                   ADD = false;
                }
                if (SUB == true){
                    TvOutput.setText(Res1 - Res2 +" ");
                    SUB = false;
                }
                if (MULT == true){
                    TvOutput.setText(Res1 * Res2 +" ");
                    MULT = false;
                }
                if (DIV == true){
                    TvOutput.setText(Res1 / Res2 +" ");
                    DIV = false;
                }
                if (Remainder) {
                    TvOutput.setText(Res1 % Res2 + "");
                    Remainder = false;
                }
                if(RAS== true){

                    Res1 = Double.parseDouble(TvOutput.getText() + " ");
                    TvOutput.setText(Math.sqrt(Res1) + " ");
                    RAS = false;

                }
            }

        });



        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               if(TvOutput.getText().length()>0)
               {
                   String name = TvOutput.getText().toString();
                   TvOutput.setText(name.subSequence(0,name.length()-1));
               }else{
                   Res1 = Double.NaN;
                   Res2 = Double.NaN;
                   TvOutput.setText(null);
               }
            }

        });

        btnRapport.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Res1 = Double.parseDouble(TvOutput.getText() + " ");
                TvOutput.setText(1/Res1 + " ");

            }

        });

        btnNegatif.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Res1 = Double.parseDouble(TvOutput.getText() + " ");
                TvOutput.setText( "-" + Res1 );

            }
        });

        btnRacine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Res1 = Double.parseDouble(TvOutput.getText() + " ");
                TvOutput.setText( Res1+"√" );
                TvOutput.setText(Math.sqrt(Res1) + " ");
                RAS = true;

            }



});

    }
}

