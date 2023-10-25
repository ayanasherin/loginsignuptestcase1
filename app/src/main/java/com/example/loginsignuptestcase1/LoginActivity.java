package com.example.loginsignuptestcase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
Button signupbtn,loginbtn;
EditText username_var,password_var;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signupbtn=findViewById(R.id.signup);
        loginbtn=findViewById(R.id.loginbtn);

        TextView username=(TextView)findViewById(R.id.editTextTextEmailAddress);
        TextView password=(TextView)findViewById(R.id.editTextTextPassword);




        Button btnlogin;
        btnlogin=findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("user") && password.getText().toString().equals("pass")) {
                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent inext2 = new Intent(LoginActivity.this, UserActivity.class);
                    startActivity(inext2);
                }

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent inext2 = new Intent(LoginActivity.this, AdminActivity.class);
                    startActivity(inext2);
                }

            }
        });



        Button btnsign;
        btnsign=findViewById(R.id.signup);
        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("") && password.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "Register", Toast.LENGTH_SHORT).show();
                    Intent inext2 = new Intent(LoginActivity.this, SignupActivity.class);
                    startActivity(inext2);
                }
            }
        });



    }
}