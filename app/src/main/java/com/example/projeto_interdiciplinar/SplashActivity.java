package com.example.projeto_interdiciplinar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Criando um Handler para atrasar a navegação por 3 segundos
        new Handler().postDelayed(() -> {
            // Navega para a MenuinicialActivity
            startActivity(new Intent(SplashActivity.this, Menuinicial.class));
            // Finaliza a SplashActivity
            finish();
        }, 5000);  // 3000 milissegundos = 3 segundos
    }
}
