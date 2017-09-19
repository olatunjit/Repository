package com.example.olatunjit.assignment2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Unlock extends AppCompatActivity {
    TextView codeinput;
    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock);
        codeinput = (TextView)findViewById(R.id.textView2);
        buttoncreator();                                //calling the buttons

        Button submit = (Button) findViewById(R.id.button6);        //submit buttons
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (password.length() == 4 && password.equals("1234")){     //verifying the password length and string
                    MainActivity.changeMessage();
                    Intent intent = new Intent(Unlock.this, MainActivity.class);
                    startActivityForResult(intent, 1);

                }
                else{
                    password = "";                  //resetting the string
                    codeinput.setText(password);
                    //Intent intent = new Intent(Unlock.this, MainActivity.class);
                    //startActivityForResult(intent, 1);
                    //call the MainActivity screen with new text
                }
            }
        });
    }
    public void buttoncreator(){                            //declaring buttons and linking it to addresses
        Button one = (Button) findViewById(R.id.button2);
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                password += "1";
                codeinput.setText(password);
            }
        });

        Button two = (Button) findViewById(R.id.button3);
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                password += "2";
                codeinput.setText(password);
            }
        });

        Button three = (Button) findViewById(R.id.button4);
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                password += "3";
                codeinput.setText(password);
            }
        });

        Button four = (Button) findViewById(R.id.button5);
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                password += "4";
                codeinput.setText(password);
            }
        });
    }
}


