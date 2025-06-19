package com.example.telasrepresentante;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class VinhoAdapter extends BaseAdapter {

    Context context;
    ArrayList<Vinho> listaVinhos;

    public VinhoAdapter(Context context, ArrayList<Vinho> listaVinhos) {
        this.context = context;
        this.listaVinhos = listaVinhos;
    }

    @Override
    public int getCount() {
        return listaVinhos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaVinhos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Vinho vinho = listaVinhos.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_vinho, parent, false);
        }

        TextView tvNome = convertView.findViewById(R.id.tv_nome_vinho);
        TextView tvSafra = convertView.findViewById(R.id.tv_safra_vinho);
        TextView tvPreco = convertView.findViewById(R.id.tv_preco_vinho);

        tvNome.setText(vinho.nome);
        tvSafra.setText(vinho.safra);
        tvPreco.setText("R$ " + String.format("%.2f", vinho.preco));


        return convertView;
    }
}
