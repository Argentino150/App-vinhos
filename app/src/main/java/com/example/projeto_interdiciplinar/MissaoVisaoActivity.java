package com.example.projeto_interdiciplinar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class MissaoVisaoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missao);

        RecyclerView recyclerView = findViewById(R.id.recycler_valores);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<String> titulos = Arrays.asList(
                "Paixão pela Vitivinicultura",
                "Compromisso com a Qualidade",
                "Sustentabilidade Ambiental",
                "Respeito às Pessoas e à Comunidade",
                "Inovação Constante"
        );

        List<String> descricoes = Arrays.asList(
                "Vivemos o vinho em cada detalhe, do cultivo à taça.",
                "Buscamos a excelência em cada safra, sem abrir mão do padrão Salut.",
                "Cuidamos da terra hoje para colher os melhores vinhos amanhã.",
                "Valorizamos quem faz parte da nossa história: colaboradores, clientes e parceiros.",
                "Aliamos tradição com novas tecnologias para surpreender em cada rótulo."
        );

        List<Integer> icones = Arrays.asList(
                R.drawable.ic_paixao,
                R.drawable.ic_qualidade,
                R.drawable.ic_sustentabilidade,
                R.drawable.ic_respeito,
                R.drawable.ic_inovacao
        );

        ValoresAdapter adapter = new ValoresAdapter(titulos, descricoes, icones);
        recyclerView.setAdapter(adapter);
    }
}
