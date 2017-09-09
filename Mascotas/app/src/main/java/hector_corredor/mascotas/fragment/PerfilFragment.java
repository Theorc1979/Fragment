package hector_corredor.mascotas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import hector_corredor.mascotas.Adapter.DetMascotaAdaptador;
import hector_corredor.mascotas.Adapter.MascotaAdaptador;
import hector_corredor.mascotas.DetalleMascota;
import hector_corredor.mascotas.R;
import hector_corredor.mascotas.pojo.DetMascota;
import hector_corredor.mascotas.pojo.Mascota;

/**
 * Created by ASUS on 07/09/2017.
 */

public class PerfilFragment extends android.support.v4.app.Fragment {


    private RecyclerView listaMascotas;
    private ArrayList<DetMascota> detMascotas;
    private GridLayoutManager Llayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentperfil, container, false);

        Llayout = new GridLayoutManager(getActivity(), 3);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotasDet1);

        listaMascotas.setLayoutManager(Llayout);

        inicialiozarListaMascotas();
        inicializarAdaptador();

        return v;

    }

    public DetMascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new DetMascotaAdaptador(detMascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicialiozarListaMascotas (){

        detMascotas = new ArrayList<>();

        detMascotas.add(new DetMascota(R.drawable.llama, "12"));
        detMascotas.add(new DetMascota(R.drawable.llama, "10"));
        detMascotas.add(new DetMascota(R.drawable.llama, "4"));
        detMascotas.add(new DetMascota(R.drawable.llama, "12"));
        detMascotas.add(new DetMascota(R.drawable.llama, "6"));
        detMascotas.add(new DetMascota(R.drawable.llama, "24"));
        detMascotas.add(new DetMascota(R.drawable.llama, "21"));
        detMascotas.add(new DetMascota(R.drawable.llama, "6"));
        detMascotas.add(new DetMascota(R.drawable.llama, "31"));
        detMascotas.add(new DetMascota(R.drawable.llama, "2"));


    }
}


