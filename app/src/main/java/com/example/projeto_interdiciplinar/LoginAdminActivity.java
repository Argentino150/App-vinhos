package com.example.projeto_interdiciplinar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginAdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin); // use o nome correto do layout

        // Definindo o nome do usuário e senha mockados
        final String mockUser = "admin";
        final String mockPassword = "12345";

        // Referências dos campos e botão
        final EditText usernameEditText = findViewById(R.id.username);
        final EditText passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.login_button);

        // Configurando o clique do botão
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obter os valores inseridos nos campos
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Verificar se o usuário e a senha correspondem aos mockados
                if (username.equals(mockUser) && password.equals(mockPassword)) {
                    // Se o login for bem-sucedido, iniciar a MenuAdminActivity
                    Intent intent = new Intent(LoginAdminActivity.this, MenuAdminActivity.class);
                    startActivity(intent);
                    finish(); // Fechar a activity de login
                } else {
                    // Caso contrário, exibir uma mensagem de erro
                    Toast.makeText(LoginAdminActivity.this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
