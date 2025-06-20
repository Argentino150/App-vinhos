package com.example.projeto_interdiciplinar;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EditarRepresentanteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_representante);

        Button btnvoltar = findViewById(R.id.btnVoltar);

        // Ação do botão "Voltar"
        btnvoltar.setOnClickListener(v -> {
            onBackPressed();
        });

    }
}
