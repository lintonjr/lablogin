package com.login.lablogin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {

    EditText txtEmail, txtSenha;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtEmail = findViewById(R.id.email);
        txtSenha = findViewById(R.id.senha);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;
                email = String.valueOf(txtEmail.getText());
                password = txtSenha.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Register.this, "Insira um email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Register.this, "Insira uma senha", Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });
    }
}