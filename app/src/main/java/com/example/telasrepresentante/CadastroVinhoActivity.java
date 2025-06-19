package com.example.telasrepresentante;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroVinhoActivity extends AppCompatActivity {

    EditText etNome, etSafra, etDescricao, etValor;
    Spinner spinnerTipo;
    Button btnAdicionarImagem, btnSalvar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_vinho);

        etNome = findViewById(R.id.et_nome);
        etSafra = findViewById(R.id.et_safra);
        etDescricao = findViewById(R.id.et_descricao);
        etValor = findViewById(R.id.et_valor);
        spinnerTipo = findViewById(R.id.spinner_tipo);
        btnAdicionarImagem = findViewById(R.id.btn_adicionar_imagem);
        btnSalvar = findViewById(R.id.btn_salvar);
        btnVoltar = findViewById(R.id.btn_voltar);

        String[] tipos = {"Escolha o tipo", "Tinto", "Branco", "Rosé"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tipos);
        spinnerTipo.setAdapter(adapter);

        btnAdicionarImagem.setOnClickListener(v ->
                Toast.makeText(this, "Abrir câmera ou galeria (implementação futura)", Toast.LENGTH_SHORT).show());

        btnSalvar.setOnClickListener(v ->
                Toast.makeText(this, "Vinho salvo com sucesso!", Toast.LENGTH_SHORT).show());

        btnVoltar.setOnClickListener(v -> finish());
    }
}
