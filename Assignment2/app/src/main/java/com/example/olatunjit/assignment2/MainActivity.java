package com.example.olatunjit.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static boolean PasswordCorrect = false;                      // static boolean to check the is correct
    static TextView welcome;                                // static text variable to change text on Main Activity Screen
    //@Override
    static public void changeMessage() {
        PasswordCorrect = true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button startBtn = (Button)findViewById(R.id.button); // declaring button variable and linking it to address
        welcome = (TextView) findViewById(R.id.textView);    // linking textView box with static welcome variable to change text
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                   // when button is click, sends the User to next screen
                if (PasswordCorrect){
                    welcome.setText("Welcome To The App! The App is Locked!");  // change the text back to Lock
                    startBtn.setText("Unlocked!");                              //change the button back to "Unlocked"
                }
                else{                                       //Switch to the second activity screen
                    Intent intent = new Intent(MainActivity.this,Unlock.class);//changing screens from MainActivity to Unlock screen
                    startActivityForResult(intent,1);
                }
                PasswordCorrect = false;
            }
        });
        if(PasswordCorrect){
            welcome.setText("The Screen Has Been Unlocked.");//change the locked screen to the unlocked screen
            startBtn.setText("Lock");                       //changing the button to Lock
        }
    }
}
