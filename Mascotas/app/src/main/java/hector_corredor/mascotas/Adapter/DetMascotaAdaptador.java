package hector_corredor.mascotas.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import hector_corredor.mascotas.R;
import hector_corredor.mascotas.pojo.DetMascota;


/**
 * Created by ASUS on 08/09/2017.
 */

public class DetMascotaAdaptador extends RecyclerView.Adapter<DetMascotaAdaptador.MascotaViewHolder>{

    ArrayList<DetMascota> detMascotas;

    public DetMascotaAdaptador (ArrayList<DetMascota> detMascotas){
        this.detMascotas = detMascotas;

    }

    @Override
    public DetMascotaAdaptador.MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_detmascota, parent, false);
        return new DetMascotaAdaptador.MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DetMascotaAdaptador.MascotaViewHolder mascotaViewHolder, int position) {
        DetMascota detMascota = detMascotas.get(position);
        mascotaViewHolder.imgFotoCV.setImageResource(detMascota.getFoto());
        mascotaViewHolder.tvHuesosCV.setText(detMascota.getHuesos());
    }

    @Override
    public int getItemCount() {//Cantidad de elementos
        return detMascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotoCV;
        private TextView tvHuesosCV;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFotoCV   = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            tvHuesosCV  = (TextView) itemView.findViewById(R.id.tvHuesosCV);
        }
    }
}
