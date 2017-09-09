package hector_corredor.mascotas.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import hector_corredor.mascotas.Adapter.MascotaAdaptador;
import hector_corredor.mascotas.R;
import hector_corredor.mascotas.pojo.Mascota;

/**
 * Created by ASUS on 07/09/2017.
 */

public class RecicleviewFragment extends android.support.v4.app.Fragment {

    private RecyclerView listaMascotas;
    private ArrayList<Mascota> mascota;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recicleview, container, false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotasDet);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicialiozarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascota);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicialiozarListaMascotas (){

        mascota = new ArrayList<>();

        mascota.add(new Mascota(R.drawable.llama, "Llama", "8"));
        mascota.add(new Mascota(R.drawable.oveja, "Oveja", "7"));
        mascota.add(new Mascota(R.drawable.pollo, "Pollo", "6"));
        mascota.add(new Mascota(R.drawable.gato, "Gato", "5"));
        mascota.add(new Mascota(R.drawable.lobo, "Lobo", "4"));

    }
}
