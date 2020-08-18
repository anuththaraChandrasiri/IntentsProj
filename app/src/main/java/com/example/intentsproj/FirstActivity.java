package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.example.intentsproj.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.intentsproj.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
    // Do something in response to button

        Intent intent = new Intent(this, SecondActivity.class);
        EditText number1 = (EditText) findViewById(R.id.textNumber1);
        String message1 = number1.getText().toString();

        EditText number2 = (EditText) findViewById(R.id.textNumber2);
        String message2 = number2.getText().toString();

        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);

        startActivity(intent);

    }
}