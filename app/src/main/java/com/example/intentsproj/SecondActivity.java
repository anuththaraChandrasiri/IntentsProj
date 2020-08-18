package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button buttonAddition = (Button) findViewById(R.id.btnAddition);
        Button buttonSubstraction = (Button) findViewById(R.id.btnSubstraction) ;
        Button buttonMultiplication = (Button) findViewById(R.id.btnMultiplication) ;
        Button buttonDivision = (Button) findViewById(R.id.btnDivision) ;

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        final String message1 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE1);
        final String message2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        // Capture the layout's TextView and set the string as its text
        TextView no1 = findViewById(R.id.displayNumber1);
        no1.setText(message1);

        TextView no2 = findViewById(R.id.displayNumber2);
        no2.setText(message2);

        buttonAddition.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Float result = Float.parseFloat(message1) + Float.parseFloat(message2) ;
                    String finalResult = Float.toString(result) ;

                TextView displayResult = findViewById(R.id.textResult) ;

                displayResult.setText(message1 + "  +  " + message2 + "  =  " + finalResult);

                }

            }

        );

        buttonSubstraction.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Float result = Float.parseFloat(message1) - Float.parseFloat(message2) ;
                    String finalResult = Float.toString(result) ;

                TextView displayResult = findViewById(R.id.textResult) ;

                displayResult.setText(message1 + "  -  " + message2 + "  =  " + finalResult);

                }

            }

        );

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Float result = Float.parseFloat(message1) * Float.parseFloat(message2) ;
                    String finalResult = Float.toString(result) ;

                TextView displayResult = findViewById(R.id.textResult) ;

                displayResult.setText(message1 + "  *  " + message2 + "  =  " + finalResult);

                }

            }

        );

        buttonDivision.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String finalResult ;

                Float result = Float.parseFloat(message1) / Float.parseFloat(message2) ;
                finalResult = Float.toString(result) ;

                TextView displayResult = findViewById(R.id.textResult) ;

                displayResult.setText(message1 + "  /  " + message2 + "  =  " + finalResult);

                }

            }

        );

    }
}