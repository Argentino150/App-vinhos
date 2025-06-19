package com.example.telasrepresentante;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListaVisitasActivity extends AppCompatActivity {

    ListView listVisitas;
    ImageView ivBack;
    ArrayList<String> visitasList;
    ArrayAdapter<String> visitasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_visitas);

        listVisitas = findViewById(R.id.list_visitas);
        ivBack = findViewById(R.id.iv_back);

        visitasList = new ArrayList<>();
        visitasList.add("Visita - Cliente A - 10/06/2025");
        visitasList.add("Visita - Cliente B - 11/06/2025");
        visitasList.add("Visita - Cliente C - 12/06/2025");

        visitasAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, visitasList);
        listVisitas.setAdapter(visitasAdapter);

        ivBack.setOnClickListener(v -> finish());

        listVisitas.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(ListaVisitasActivity.this, "Clique em: " + visitasList.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}