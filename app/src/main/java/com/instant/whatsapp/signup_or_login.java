package com.instant.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup_or_login extends AppCompatActivity {
    private Button signup_btn, login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_or_login);
        login_btn=findViewById(R.id.login_signup_or_login);
        signup_btn=findViewById(R.id.signup_btn_signup_or_login);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup_or_login.this,login.class);
                startActivity(intent);
                finish();
            }
        });
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup_or_login.this,signup.class);
                startActivity(intent);
                finish();
            }
        });
    }
}