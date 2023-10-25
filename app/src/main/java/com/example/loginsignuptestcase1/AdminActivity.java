package com.example.loginsignuptestcase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdminActivity extends AppCompatActivity {

    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
       
    }
    public void District(View view) {
        Intent i = new Intent(getApplicationContext(), ViewDistrictActivity.class);
        startActivity(i);
    }
}