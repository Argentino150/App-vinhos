package com.example.telasrepresentante;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListaClientesActivity extends AppCompatActivity {

    ListView listClientes;
    Button btnAdicionarCliente;
    ArrayList<String> clientes;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);

        listClientes = findViewById(R.id.list_clientes);
        btnAdicionarCliente = findViewById(R.id.btn_adicionar_cliente);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Matheus Leandro", "Rua das Flores, 142"));
        clientes.add(new Cliente("Matheus Leandro", "Rua das Flores, 142"));
        clientes.add(new Cliente("Matheus Leandro", "Rua das Flores, 142"));

        ClienteAdapter adapter = new ClienteAdapter(this, clientes);
        listClientes.setAdapter(adapter);

        btnAdicionarCliente.setOnClickListener(v ->
                Toast.makeText(this, "Abrir tela de cadastro de cliente", Toast.LENGTH_SHORT).show());

        listClientes.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this, "Clique em: " + clientes.get(position), Toast.LENGTH_SHORT).show());
    }
}