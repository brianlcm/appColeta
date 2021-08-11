package com.example.appcoleta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rotas extends Fragment {

    private TextView dataText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rotas, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        String dataFormatada = formataData.format(data);
        dataText = (TextView) getActivity().findViewById(R.id.rota_data);
        dataText.setText(dataFormatada);
    }
}