package com.example.telasrepresentante;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditarClienteActivity extends AppCompatActivity {

    EditText etNome, etSobrenome, etCpf, etEmail, etTelefone, etEndereco, etRepresentante;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_cliente);

        etNome = findViewById(R.id.et_nome);
        etSobrenome = findViewById(R.id.et_sobrenome);
        etCpf = findViewById(R.id.et_cpf);
        etEmail = findViewById(R.id.et_email);
        etTelefone = findViewById(R.id.et_telefone);
        etEndereco = findViewById(R.id.et_endereco);
        etRepresentante = findViewById(R.id.et_representante);
        btnSalvar = findViewById(R.id.btn_salvar);

        btnSalvar.setOnClickListener(v ->
                Toast.makeText(this, "Cliente atualizado com sucesso!", Toast.LENGTH_SHORT).show());
    }
}