package com.example.codept.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText username,password;
    private static Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }
    public void login(){

        username=(EditText)findViewById(R.id.t1);
        password=(EditText)findViewById(R.id.t2);
        loginbtn=(Button)findViewById(R.id.lbutton);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aa1=username.getText().toString();
                String aa2=password.getText().toString();
                if(aa1.equals("bilal") && aa2.equals("bilal")){
                    Toast.makeText(getApplicationContext(), "Succefully loigin", Toast.LENGTH_LONG).show();

                }
                else{

                    Toast.makeText(getApplicationContext(), "You are not login try agin", Toast.LENGTH_SHORT).show();


                }
            }
        });

    }

}
