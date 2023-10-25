package com.example.loginsignuptestcase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {
    TextView email_var,password_var;
    FirebaseDatabase firebasedatabase;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        email_var = findViewById(R.id.editTextTextEmailAddress);
        password_var = findViewById(R.id.editTextTextPassword);


    }

    public void loginbuttonclick(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void registerbuttonclick(View view){
        String fullemail_ =email_var.getText().toString();
        String password_ = password_var.getEditableText().toString();

        if(!fullemail_.isEmpty()){
            email_var.setError(null);
            email_var.setEnabled(false);
            if(!password_.isEmpty()){
                password_var.setError(null);
                password_var.setEnabled(false);

  /*     if(!email_var.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-z]{2,5})$\"")){ }else{ }    */



            }else{
                password_var.setError("please enter the password");

            }

        }
        else{
            email_var.setError("please enter the email");
        }





    }


}