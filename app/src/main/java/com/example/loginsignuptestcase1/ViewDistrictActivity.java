package com.example.loginsignuptestcase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViewDistrictActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_district);
    }

    public void district(View view) {
        Intent add = new Intent(getApplicationContext(), AddPlaceActivity.class);
        startActivity(add);

    }
}