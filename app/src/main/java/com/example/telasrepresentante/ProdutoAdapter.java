package com.example.telasrepresentante;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ProdutoAdapter extends BaseAdapter {

    Context context;
    ArrayList<Produto> produtos;

    public ProdutoAdapter(Context context, ArrayList<Produto> produtos) {
        this.context = context;
        this.produtos = produtos;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Produto produto = produtos.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_produto_pedido, parent, false);
        }

        TextView tvNome = convertView.findViewById(R.id.tv_nome_produto);
        TextView tvDescricao = convertView.findViewById(R.id.tv_descricao_produto);
        TextView tvQuantidade = convertView.findViewById(R.id.tv_quantidade);
        TextView tvPreco = convertView.findViewById(R.id.tv_preco);

        // Exemplo de set (você pode personalizar depois)
        tvNome.setText(produto.nome);
        tvDescricao.setText(produto.descricao);
        tvQuantidade.setText(String.valueOf(produto.quantidade));
        tvPreco.setText("R$ " + String.format("%.2f", produto.preco));


        return convertView;
    }
}