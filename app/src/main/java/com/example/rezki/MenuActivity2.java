package com.example.rezki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }

    public void violon(View view) {
Intent v = new Intent(this,ViolonActivity2.class);
startActivity(v);
    }

    public void guitare(View view) {
        Intent j = new Intent(this,guitareActivity2.class);
        startActivity(j);
    }

    public void piano(View view) {
        Intent h = new Intent(this,pianoActivity2.class);
        startActivity(h);
    }

    public void saxo(View view) {
        Intent  r = new Intent(this,saxoActivity2.class);
        startActivity(r);
    }

    public void oud(View view) {
        Intent  s = new Intent(this,oudActivity2.class);
        startActivity(s);
    }

    public void drum(View view) {
        Intent  kj = new Intent(this,drumActivity2.class);
        startActivity(kj);
    }
}