package com.example.appcoleta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class detalhesRota extends Fragment {

    private TextView dataText, regiaoText, motoristaText, horarioInicioText, enfermeirosText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalhes_rota, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        // Configura data
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        String dataFormatada = formataData.format(data);
        dataText = (TextView) getActivity().findViewById(R.id.detalhes_rota_data_resposta);
        dataText.setText(dataFormatada);

        regiaoText = (TextView) getActivity().findViewById(R.id.detalhes_rota_regiao_resposta);
        regiaoText.setText("Francisco Bernardino");

        enfermeirosText = (TextView) getActivity().findViewById(R.id.detalhes_rota_enfermeiros_resposta);
        enfermeirosText.setText("Ana Carolina");

        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("AC.ANTI ANIDRASE CARBONICA");

        ListView listaDePacotesLotes = getActivity().findViewById(R.id.detalhes_rota_lista_exames);
        listaDePacotesLotes.setAdapter(new ListaExamesAdapter(mylist,getContext()));

        motoristaText = (TextView) getActivity().findViewById(R.id.detalhes_rota_motorista_resposta);
        motoristaText.setText("José Ricardo");

        horarioInicioText = (TextView) getActivity().findViewById(R.id.detalhes_rota_horario_inicio_resposta);
        horarioInicioText.setText("9:00");

    }
}