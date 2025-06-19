package com.example.telasrepresentante;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListaVinhosActivity extends AppCompatActivity {

    ListView listVinhos;
    Button btnAdicionarVinho;
    ArrayList<Vinho> vinhos;
    VinhoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_vinhos);

        listVinhos = findViewById(R.id.list_vinhos);
        btnAdicionarVinho = findViewById(R.id.btn_adicionar_vinho);

        vinhos = new ArrayList<>();
        vinhos.add(new Vinho("Vinho Francês Tinto Château De Sales", "2014", 159.90));
        vinhos.add(new Vinho("Vinho Tinto Suave Bordô San Martin", "2019", 49.90));

        adapter = new VinhoAdapter(this, vinhos);
        listVinhos.setAdapter(adapter);

        btnAdicionarVinho.setOnClickListener(v ->
                Toast.makeText(this, "Abrir tela de cadastro de vinho", Toast.LENGTH_SHORT).show());
    }
}