package com.example.projeto_interdiciplinar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin);

        EditText edtUsuario = findViewById(R.id.edtUsuario);
        EditText edtSenha = findViewById(R.id.edtSenha);
        Button btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(v -> {
            String usuario = edtUsuario.getText().toString().trim();
            String senha = edtSenha.getText().toString().trim();

            if (usuario.equals("admin") && senha.equals("admin123")) {
                Intent intent = new Intent(this, MenuAdminActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, getString(R.string.login_falhou), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
