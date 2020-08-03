package com.example.hw3_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initEngineer();
    }

    private void initEngineer () {
        final TextView resultEng = findViewById(R.id.resultEng);
        Button nineEngBtn = findViewById(R.id.nineEngBtn);
        Button eightEngBtn = findViewById(R.id.eightEngBtn);
        Button sevenEngBtn = findViewById(R.id.sevenEngBtn);
        Button sixEngBtn = findViewById(R.id.sixEngBtn);
        Button fiveEngBtn = findViewById(R.id.fiveEngBtn);
        Button fourEngBtn = findViewById(R.id.fourEngBtn);
        Button threeEngBtn = findViewById(R.id.threeEngBtn);
        Button twoEngBtn = findViewById(R.id.twoEngBtn);
        Button oneEngBtn = findViewById(R.id.oneEngBtn);
        Button zeroEngBtn = findViewById(R.id.zeroEngBtn);
        Button decimalPointEngBtn = findViewById(R.id.decimalPointEngBtn);
        Button clearingEngBtn = findViewById(R.id.clearingEngBtn);

        nineEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("9");
            }
        });

        eightEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("8");
            }
        });

        sevenEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("7");
            }
        });

        sixEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("6");
            }
        });

        fiveEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("5");
            }
        });

        fourEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("4");
            }
        });

        threeEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("3");
            }
        });

        twoEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("2");
            }
        });

        oneEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("1");
            }
        });

        zeroEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("0");
            }
        });

        decimalPointEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText(".");
            }
        });

        clearingEngBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultEng.setText("");
            }
        });
    }
}