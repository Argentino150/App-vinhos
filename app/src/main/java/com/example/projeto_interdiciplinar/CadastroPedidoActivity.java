package com.example.projeto_interdiciplinar;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroPedidoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido_cliente);

        Button btnvoltar = findViewById(R.id.btn_voltar);

        // Ação do botão "Voltar"
        btnvoltar.setOnClickListener(v -> {
            onBackPressed();
        });

    }
}
