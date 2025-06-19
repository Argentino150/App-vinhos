package com.example.telasrepresentante;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.BaseAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class ClienteAdapter extends BaseAdapter {

    Context context;
    ArrayList<Cliente> listaClientes;

    public ClienteAdapter(Context context, ArrayList<Cliente> listaClientes) {
        this.context = context;
        this.listaClientes = listaClientes;
    }

    @Override
    public int getCount() {
        return listaClientes.size();
    }

    @Override
    public Object getItem(int position) {
        return listaClientes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Cliente cliente = listaClientes.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_cliente, parent, false);
        }

        TextView tvNome = convertView.findViewById(R.id.tv_nome_cliente);
        TextView tvEndereco = convertView.findViewById(R.id.tv_endereco_cliente);

        tvNome.setText(cliente.nome);
        tvEndereco.setText(cliente.endereco);

        return convertView;
    }
}