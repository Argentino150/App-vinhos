package com.example.projeto_interdiciplinar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuAdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_admin);

        Button btnVinhos = findViewById(R.id.btnVinhos);
        Button btnSair = findViewById(R.id.btnSair);

        btnVinhos.setOnClickListener(v -> {
            startActivity(new Intent(this, VinhosActivity.class));
        });

        btnSair.setOnClickListener(v -> {
            finishAffinity();
        });
    }
}
