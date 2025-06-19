package com.example.telasrepresentante;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroPedidoClienteActivity extends AppCompatActivity {

    EditText etCliente, etSobrenome, etRepresentante, etTelefone, etEndereco;
    Spinner spinnerFormaPagamento;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido_cliente);

        etCliente = findViewById(R.id.et_cliente);
        etSobrenome = findViewById(R.id.et_sobrenome);
        etRepresentante = findViewById(R.id.et_representante);
        etTelefone = findViewById(R.id.et_telefone);
        etEndereco = findViewById(R.id.et_endereco);
        spinnerFormaPagamento = findViewById(R.id.spinner_forma_pagamento);
        btnSalvar = findViewById(R.id.btn_salvar);

        String[] formas = {"Selecione", "Dinheiro", "Cartão", "Pix"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, formas);
        spinnerFormaPagamento.setAdapter(adapter);

        btnSalvar.setOnClickListener(v -> {
            Toast.makeText(this, "Dados do cliente salvos!", Toast.LENGTH_SHORT).show();
        });
    }
}