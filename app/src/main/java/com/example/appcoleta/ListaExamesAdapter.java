package com.example.appcoleta;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListaExamesAdapter extends BaseAdapter {
    private final List<String> pacotes;
    private final Context context;

    public ListaExamesAdapter(List<String> pacotes, Context context) {
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public String getItem(int posicao) {
        return pacotes.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return 0;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_exame, parent, false);
        final String pacote = pacotes.get(posicao);

        TextView nome = viewCriada.findViewById(R.id.item_exame_nome);
        nome.setText(pacote);

        return viewCriada;
    }
}
