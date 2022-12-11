package com.example.rezki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class drumActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum2);
    }

    public void back(View view) {
        Intent j = new Intent(this,MenuActivity2.class);
        startActivity(j);
    }
}