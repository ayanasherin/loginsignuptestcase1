package com.example.loginsignuptestcase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }


    public void district(View view){

        Intent intent=new Intent(this, UserExploreActivity.class);
        startActivity(intent);
    }


}