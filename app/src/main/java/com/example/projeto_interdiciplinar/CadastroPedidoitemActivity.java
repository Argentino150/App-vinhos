package com.example.projeto_interdiciplinar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroPedidoitemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido_itens);

        Button btnverresumo = findViewById(R.id.btn_ver_resumo);
        Button btnvoltar = findViewById(R.id.btn_voltar);

        // Ação do botão "Ver Resumo"
        btnverresumo.setOnClickListener(v -> {
            startActivity(new Intent(this, Resumopedido.class));
        });

        // Ação do botão "Voltar"
        btnvoltar.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}
