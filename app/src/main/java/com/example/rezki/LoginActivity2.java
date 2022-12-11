package com.example.rezki;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity2 extends AppCompatActivity {

EditText Username ;
EditText pass ;
Button Login ;
DBHelper db ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
   Username =(EditText) findViewById(R.id.Username);
   pass =  (EditText) findViewById(R.id.pass);
   db= new DBHelper(this );
    }




    public void login(View v) {
     String user = Username.getText().toString() ;
        String Pass = pass.getText().toString() ;
        if(TextUtils.isEmpty(user)||TextUtils.isEmpty(Pass))
            Toast.makeText(this, "Tout les champs sont obigatoires  ", Toast.LENGTH_SHORT).show();
        else {
            Boolean checkuserpass  = db.checkusernamepassword(user,Pass);

            if(checkuserpass== true ){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                Intent j = new Intent(this,MenuActivity2.class);
                startActivity(j);
            }else{
                Toast.makeText(LoginActivity2.this,"login Failed",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void Register(View view) {
        Intent j = new Intent(this,RegisterActivity2.class);
        startActivity(j);
    }
}