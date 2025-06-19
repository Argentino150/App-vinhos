package com.example.projeto_interdiciplinar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ValoresAdapter extends RecyclerView.Adapter<ValoresAdapter.ValorViewHolder> {
    private List<String> titulos;
    private List<String> descricoes;

    private List<Integer> icones;


    public ValoresAdapter(List<String> titulos, List<String> descricoes, List<Integer> icones) {
        this.titulos = titulos;
        this.descricoes = descricoes;
        this.icones = icones;
    }

    @NonNull
    @Override
    public ValorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_valor, parent, false);
        return new ValorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ValorViewHolder holder, int position) {
        holder.titulo.setText(titulos.get(position));
        holder.descricao.setText(descricoes.get(position));
        holder.icon.setImageResource(icones.get(position));
    }

    @Override
    public int getItemCount() {
        return titulos.size();
    }



    static class ValorViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView titulo, descricao;
        ValorViewHolder(View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo_valor);
            descricao = itemView.findViewById(R.id.descricao_valor);
            icon = itemView.findViewById(R.id.img_icon);
        }
    }
}