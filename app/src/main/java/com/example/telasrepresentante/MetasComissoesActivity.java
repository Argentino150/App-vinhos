package com.example.telasrepresentante;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MetasComissoesActivity extends AppCompatActivity {

    ListView listMetas;
    ImageView ivBack;
    ArrayList<String> metasList;
    ArrayAdapter<String> metasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metas_comissoes);

        listMetas = findViewById(R.id.list_metas);
        ivBack = findViewById(R.id.iv_back);

        metasList = new ArrayList<>();
        metasList.add("Meta: R$ 10.000 - Comissão: R$ 500");
        metasList.add("Meta: R$ 20.000 - Comissão: R$ 1.200");
        metasList.add("Meta: R$ 30.000 - Comissão: R$ 2.000");

        metasAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, metasList);
        listMetas.setAdapter(metasAdapter);

        ivBack.setOnClickListener(v -> finish());
    }
}