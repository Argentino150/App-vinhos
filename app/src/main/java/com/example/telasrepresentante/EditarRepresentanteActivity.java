package com.example.telasrepresentante;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class EditarRepresentanteActivity extends AppCompatActivity {

    private EditText edtNome, edtSobrenome, edtEmail, edtTelefone, edtRegiao;
    private Spinner spinnerStatus;
    private Button btnSalvar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_representante);

        // Remover o código do Toolbar
        // Não há mais necessidade do Toolbar aqui

        edtNome = findViewById(R.id.edtNome);
        edtSobrenome = findViewById(R.id.edtSobrenome);
        edtEmail = findViewById(R.id.edtEmail);
        edtTelefone = findViewById(R.id.edtTelefone);
        edtRegiao = findViewById(R.id.edtRegiao);
        spinnerStatus = findViewById(R.id.spinnerStatus);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnVoltar = findViewById(R.id.btnVoltar);

        // Exemplo de preenchimento de dados existentes
        edtNome.setText("Matheus");
        edtSobrenome.setText("Leandro");
        edtEmail.setText("seuemail@email.com");
        edtTelefone.setText("(99) 999999999");
        edtRegiao.setText("Região");

        // Configuração do Spinner para Status
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.status_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStatus.setAdapter(adapter);

        // Ação para salvar os dados
        btnSalvar.setOnClickListener(v -> {
            Toast.makeText(this, "Dados atualizados!", Toast.LENGTH_SHORT).show();
        });

        // Ação para voltar para a tela anterior
        btnVoltar.setOnClickListener(v -> finish());
    }
}
