package com.example.projeto_interdiciplinar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.projeto_interdiciplinar.api.ApiService;
import com.example.projeto_interdiciplinar.api.RetrofitClient;
import com.example.projeto_interdiciplinar.model.LoginRequest;
import com.example.projeto_interdiciplinar.model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginAdminActivity extends AppCompatActivity {

    // Variáveis para os elementos da UI
    private EditText edtUsuario;
    private EditText edtSenha;
    private Button btnEntrar;
    private Button btnRegistrar;
    private TextView txtEsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin);

        // Conectando as variáveis com os NOVOS IDs do seu arquivo XML
        edtUsuario = findViewById(R.id.username);       // ATUALIZADO
        edtSenha = findViewById(R.id.password);         // ATUALIZADO
        btnEntrar = findViewById(R.id.login_button);    // ATUALIZADO
        btnRegistrar = findViewById(R.id.btnRegistrar);
        txtEsqueciSenha = findViewById(R.id.txtEsqueciSenha);

        // Configura a ação do botão "Entrar"
        btnEntrar.setOnClickListener(v -> fazerLoginAdmin());

        btnRegistrar.setOnClickListener(v -> {
            Toast.makeText(this, "Funcionalidade não implementada", Toast.LENGTH_SHORT).show();
        });

        txtEsqueciSenha.setOnClickListener(v -> {
            Toast.makeText(this, "Funcionalidade não implementada", Toast.LENGTH_SHORT).show();
        });
    }

    private void fazerLoginAdmin() {
        String email = edtUsuario.getText().toString().trim();
        String senha = edtSenha.getText().toString().trim();

        if (email.isEmpty() || senha.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        LoginRequest loginRequest = new LoginRequest(email, senha);
        ApiService apiService = RetrofitClient.getApiService();

        apiService.login(loginRequest).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Toast.makeText(LoginAdminActivity.this, "Login de Admin bem-sucedido!", Toast.LENGTH_SHORT).show();

                    String token = response.body().getToken();

                    SharedPreferences prefs = getSharedPreferences("auth", MODE_PRIVATE);
                    prefs.edit().putString("token", "Bearer " + token).apply();

                    Intent intent = new Intent(LoginAdminActivity.this, MenuAdminActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginAdminActivity.this, "Email ou senha de Admin inválidos", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginAdminActivity.this, "Erro de conexão: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}