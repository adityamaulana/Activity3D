package com.example.assignment_1_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

            if(edemail.getText().toString().equals("emailcontoh@mail.com")&& edpassword.getText().toString().equals("123")){
                Toast t = Toast.makeText(getApplicationContext(),
                        "Login Berhasil", Toast.LENGTH_LONG);
                t.show();
            }
            else if(!edemail.getText().toString().equals("emailcontoh@mail.com")) {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Email Yang Anda Masukkan Salah", Toast.LENGTH_LONG);
                t.show();
            }
            else if(!edpassword.getText().toString().equals("123")){
                Toast t = Toast.makeText(getApplicationContext(),
                        "Password Yang Anda Masukkan Salah", Toast.LENGTH_LONG);
                t.show();
            }
            else {
                Toast.makeText((getApplicationContext()),
                        "Email dan Password Anda Salah", Toast.LENGTH_LONG).show();
            }

            }
        });
    }
}

