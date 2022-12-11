package com.example.rezki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity2 extends AppCompatActivity {
 EditText Username ;
 EditText pass ;
 EditText confirmpass;
 EditText Email ;
 Button register ;
 DBHelper db ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        Username = (EditText) findViewById(R.id.Username);
        pass = (EditText) findViewById(R.id.pass);
        confirmpass = (EditText) findViewById(R.id.confirmpass);
      //  Email = (EditText) findViewById(R.id.Email);
      register = (Button) findViewById(R.id.register);
db = new DBHelper(this);
    }

    public void Register(View view) {
        String user = Username.getText().toString();
        String Pass = pass.getText().toString();
        String repass = confirmpass.getText().toString();
      //  String email = Email.getText().toString();
        if(TextUtils.isEmpty(user)||TextUtils.isEmpty(Pass)||TextUtils.isEmpty(repass))
            Toast.makeText(RegisterActivity2.this,"Tous les champs sont obligatoire",Toast.LENGTH_SHORT).show();
        else {
            if(Pass.equals(repass)){
                Boolean checkuser = db.Checkuseranme(user);
                System.out.println("notexists"+checkuser);
                if(checkuser==false){

                    Boolean insert = db.insertData(user,Pass);
                    System.out.println("notexists"+insert);
                    if(insert == true ){
                        Toast.makeText(RegisterActivity2.this,"vous étes bien inscrit",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        
                    }else{
                        Toast.makeText(RegisterActivity2.this, "Veuillez refaire l'inscription", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(RegisterActivity2.this,"Ce user est déja existe",Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(RegisterActivity2.this," password non identique ",Toast.LENGTH_SHORT).show();
            }
        }
    }
}