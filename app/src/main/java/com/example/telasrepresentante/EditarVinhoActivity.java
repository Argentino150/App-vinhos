package com.example.telasrepresentante;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class EditarVinhoActivity extends AppCompatActivity {

    EditText etNome, etSafra, etDescricao, etValor;
    Spinner spinnerTipo;
    Button btnAdicionarImagem, btnSalvar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_vinho);  // Pode ser o mesmo layout

        etNome = findViewById(R.id.et_nome);
        etSafra = findViewById(R.id.et_safra);
        etDescricao = findViewById(R.id.et_descricao);
        etValor = findViewById(R.id.et_valor);
        spinnerTipo = findViewById(R.id.spinner_tipo);
        btnAdicionarImagem = findViewById(R.id.btn_adicionar_imagem);
        btnSalvar = findViewById(R.id.btn_salvar);
        btnVoltar = findViewById(R.id.btn_voltar);

        // Mudar o título da tela
        setTitle(getString(R.string.editando_vinho));

        String[] tipos = {"Escolha o tipo", "Tinto", "Branco", "Rosé"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tipos);
        spinnerTipo.setAdapter(adapter);

        // Exemplo de preenchimento de campos (mock)
        etNome.setText("Vinho Exemplo");
        etSafra.setText("2014");
        etDescricao.setText("Descrição do vinho...");
        etValor.setText("99.90");
        spinnerTipo.setSelection(1); // Exemplo: seleciona "Tinto"

        btnAdicionarImagem.setOnClickListener(v -> {
            // Código futuro para adicionar/editar imagem
        });

        btnSalvar.setOnClickListener(v -> {
            // Salvar alterações
        });

        btnVoltar.setOnClickListener(v -> finish());
    }
}
