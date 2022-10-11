package com.instant.whatsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.zip.Inflater;

public class signup extends AppCompatActivity {

    private Button signup_btn;
    private EditText email_edit_txt, pass;
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signup_btn = findViewById(R.id.signup_btn);
        email_edit_txt = findViewById(R.id.email_edit_txt);
        pass = findViewById(R.id.pass);
        auth=FirebaseAuth.getInstance();

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.createUserWithEmailAndPassword(email_edit_txt.getText().toString(), pass.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    Intent intent= new Intent(signup.this,login.class);
                                    startActivity(intent);
                                    finish();
                                }
                                else
                                    Toast.makeText(signup.this, "fail", Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

    }
}