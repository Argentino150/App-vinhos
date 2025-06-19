package com.example.telasrepresentante;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ResumoPedidoActivity extends AppCompatActivity {

    Button btnSalvarPdf, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido);

        btnSalvarPdf = findViewById(R.id.btn_salvar_pdf);
        btnVoltar = findViewById(R.id.btn_voltar);

        btnSalvarPdf.setOnClickListener(v -> {
            Toast.makeText(this, "Salvando PDF... (função futura)", Toast.LENGTH_SHORT).show();
        });

        btnVoltar.setOnClickListener(v -> finish());
    }
}