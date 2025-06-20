package com.example.projeto_interdiciplinar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Aplicando ajustes de insets para as barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            // Obtém os insets das barras do sistema
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            // Ajusta o padding da view para acomodar as barras do sistema
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            // Retorna os insets para continuar a propagação
            return insets;
        });
    }
}
