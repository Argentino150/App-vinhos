package com.example.projeto_interdiciplinar;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EditarVinhoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_vinho);

        Button btnvoltar = findViewById(R.id.btn_voltar);

        // Ação do botão "Voltar"
        btnvoltar.setOnClickListener(v -> {
            onBackPressed();
        });

    }
}
