package com.example.telasrepresentante;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuAdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_admin);


        Button btnSair = findViewById(R.id.btnSair);


        btnSair.setOnClickListener(v -> {
            finishAffinity();
        });
    }
}
