package com.example.telasrepresentante;


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

        // Usando WindowInsetsCompat para ajustar os insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            // Obtém os insets das barras do sistema (barra de status, barra de navegação)
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            // Ajuste o padding conforme necessário
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;  // Retorna os insets para que a aplicação de insets continue funcionando
        });
    }
}
