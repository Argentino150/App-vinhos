package com.example.projeto_interdiciplinar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuAdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_admin);

// Botão "Vinhos" - Leva para a Activity de Vinhos
        Button btnVinhos = findViewById(R.id.btnVinhos);
        btnVinhos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAdminActivity.this, VinhoActivity.class); //
                startActivity(intent);
            }
        });

//        // Botão "Clientes" - Leva para a Activity de Clientes
//        Button btnClientes = findViewById(R.id.btnClientes);
//        btnClientes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MenuAdminActivity.this, ClientesActivity.class); // Troque ClientesActivity pelo nome correto
//                startActivity(intent);
//            }
//        });

        // Botão "Representantes" - Leva para a Activity de Representantes
//        Button btnVendedores = findViewById(R.id.btnVendedores);
//        btnVendedores.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MenuAdminActivity.this, RepresentantesActivity.class); // Troque RepresentantesActivity pelo nome correto
//                startActivity(intent);
//            }
//        });

//        // Botão "Pedidos" - Leva para a Activity de Pedidos
//        Button btnPedidos = findViewById(R.id.btnPedidos);
//        btnPedidos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MenuAdminActivity.this, PedidosActivity.class); // Troque PedidosActivity pelo nome correto
//                startActivity(intent);
//            }
//        });

//        // Botão "Relatórios" - Leva para a Activity de Relatórios
//        Button btnRelatorios = findViewById(R.id.btnRelatorios);
//        btnRelatorios.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MenuAdminActivity.this, RelatoriosActivity.class); // Troque RelatoriosActivity pelo nome correto
//                startActivity(intent);
//            }
//        });

        // Botão "Sair" - Finaliza a atividade e volta para a tela de login
        Button btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
