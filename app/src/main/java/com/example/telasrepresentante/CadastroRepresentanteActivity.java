package com.example.telasrepresentante;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastroRepresentanteActivity extends AppCompatActivity {

    private EditText edtNome, edtSobrenome, edtEmail, edtTelefone, edtRegiao;
    private Spinner spinnerStatus;
    private Button btnSalvar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_representante);

        // Remover o código relacionado ao Toolbar

        // Inicializando campos do formulário
        edtNome = findViewById(R.id.edtNome);
        edtSobrenome = findViewById(R.id.edtSobrenome);
        edtEmail = findViewById(R.id.edtEmail);
        edtTelefone = findViewById(R.id.edtTelefone);
        edtRegiao = findViewById(R.id.edtRegiao);
        spinnerStatus = findViewById(R.id.spinnerStatus);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnVoltar = findViewById(R.id.btnVoltar);

        // Configuração do Spinner para Status
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.status_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStatus.setAdapter(adapter);

        // Ação para salvar o cadastro
        btnSalvar.setOnClickListener(v -> {
            Toast.makeText(this, "Representante cadastrado!", Toast.LENGTH_SHORT).show();
        });

        // Ação para voltar para a tela anterior
        btnVoltar.setOnClickListener(v -> finish());
    }
}
