package com.andres00099216.pruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterA;
    private TextView counterB;
    private Integer teamCounter1;
    private Integer teamCounter1aux;
    private Integer teamCounter2aux;
    private Integer teamCounter2;
    private Button buttonP1, buttonP2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterA = findViewById(R.id.counterA);
        counterB = findViewById(R.id.counterB);
        buttonP1=findViewById(R.id.team1);
        buttonP2=findViewById(R.id.team2);
    }

    public void addA(View v){
        teamCounter1 = Integer.parseInt(counterA.getText().toString());
        teamCounter2 = Integer.parseInt(counterB.getText().toString());
        teamCounter1aux=0;

        if(teamCounter1==41){
            teamCounter1aux=teamCounter1;
            if(teamCounter1!=teamCounter2 && teamCounter1>teamCounter2){
                teamCounter1=42;
                counterA.setText("Game!!");
                enableFalse();
            }else{
                teamCounter1=41;
                teamCounter2=40;
                counterA.setText(String.valueOf(teamCounter1));
                counterB.setText(String.valueOf(teamCounter2));
            }
        }
        if(teamCounter1==40 && teamCounter1aux != 41 ){
            if(teamCounter1!=teamCounter2 && teamCounter1>teamCounter2){
                teamCounter1=42;
                counterA.setText("Game!!");
                enableFalse();
            }else{
                teamCounter1=41;
                counterA.setText(String.valueOf(teamCounter1));
            }
        }
        if (teamCounter1 == 30) {
            teamCounter1 = teamCounter1 + 10;
            counterA.setText(String.valueOf(teamCounter1));
        }
        if (teamCounter1 < 30){
            teamCounter1 = teamCounter1 + 15;
            counterA.setText(String.valueOf(teamCounter1));
        }
    }

    public void addB(View v) {
        teamCounter2 = Integer.parseInt(counterB.getText().toString());
        teamCounter1 = Integer.parseInt(counterA.getText().toString());
        teamCounter2aux=0;

        if(teamCounter2==41){
            teamCounter2aux=teamCounter2;
            if(teamCounter2!=teamCounter1 && teamCounter2>teamCounter1){
                teamCounter2=42;
                counterB.setText("Game!!");
                enableFalse();
            }else{
                teamCounter1=40;
                teamCounter2=41;
                counterA.setText(String.valueOf(teamCounter1));
                counterB.setText(String.valueOf(teamCounter2));
            }
        }
        if(teamCounter2==40 && teamCounter2aux !=41 ){
            if(teamCounter2!=teamCounter1 && teamCounter2>teamCounter1){
                teamCounter2=42;
                counterB.setText("Game!!");
                enableFalse();
            }else{
                teamCounter2=41;
                counterB.setText(String.valueOf(teamCounter2));
            }
        }
        if (teamCounter2 == 30) {
            teamCounter2 = teamCounter2 + 10;
            counterB.setText(String.valueOf(teamCounter2));
        }
        if (teamCounter2 < 30) {
            teamCounter2 = teamCounter2 + 15;
            counterB.setText(String.valueOf(teamCounter2));
        }

    }
    public void resetTeams(View v){
        counterA.setText("0");
        counterB.setText("0");
        enableTrue();
    }


    private void enableFalse(){
        buttonP1.setEnabled(false);
        buttonP2.setEnabled(false);
    }

    private void enableTrue(){
        buttonP1.setEnabled(true);
        buttonP2.setEnabled(true);
    }



}
