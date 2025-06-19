package com.example.telasrepresentante;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CadastroPedidoItensActivity extends AppCompatActivity {

    ListView listItens;
    Button btnSalvar, btnVerResumo, btnVoltar;
    ArrayList<String> itensList;
    ArrayAdapter<String> itensAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido_itens);

        listItens = findViewById(R.id.list_itens);
        btnSalvar = findViewById(R.id.btn_salvar);
        btnVerResumo = findViewById(R.id.btn_ver_resumo);
        btnVoltar = findViewById(R.id.btn_voltar);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Vinho Francês Tinto Château De Sales", "2014", 159.90, 1));
        produtos.add(new Produto("Vinho Francês Tinto Château De Sales", "2014", 159.90, 1));

        ProdutoAdapter adapter = new ProdutoAdapter(this, produtos);
        listItens.setAdapter(adapter);

        btnSalvar.setOnClickListener(v ->
                Toast.makeText(this, "Itens salvos com sucesso!", Toast.LENGTH_SHORT).show());

        btnVerResumo.setOnClickListener(v -> {
            Intent intent = new Intent(CadastroPedidoItensActivity.this, ResumoPedidoActivity.class);
            startActivity(intent);
        });

        btnVoltar.setOnClickListener(v -> finish());
    }
}