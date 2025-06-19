package com.example.telasrepresentante;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NovaVisitaActivity extends AppCompatActivity {

    EditText etNome, etCpf, etEmail, etTelefone, etEndereco;
    Spinner spinnerDateTime;
    Button btnSave, btnCancel;
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_visita);

        etNome = findViewById(R.id.et_nome);
        etCpf = findViewById(R.id.et_cpf);
        etEmail = findViewById(R.id.et_email);
        etTelefone = findViewById(R.id.et_telefone);
        etEndereco = findViewById(R.id.et_endereco);
        spinnerDateTime = findViewById(R.id.spinner_date_time);
        btnSave = findViewById(R.id.btn_save);
        btnCancel = findViewById(R.id.btn_cancel);


        String[] horarios = {"Selecione", "08:00", "10:00", "14:00", "16:00"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, horarios);
        spinnerDateTime.setAdapter(adapter);

        btnSave.setOnClickListener(v -> {
            Toast.makeText(this, "Visita salva com sucesso!", Toast.LENGTH_SHORT).show();
            finish();
        });

        btnCancel.setOnClickListener(v -> finish());
    }
}