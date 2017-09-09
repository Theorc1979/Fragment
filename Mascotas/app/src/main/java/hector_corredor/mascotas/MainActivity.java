package hector_corredor.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import hector_corredor.mascotas.Adapter.MascotaAdaptador;
import hector_corredor.mascotas.pojo.Mascota;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascota;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicialiozarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascota);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicialiozarListaMascotas (){

        mascota = new ArrayList<Mascota>();

        mascota.add(new Mascota(R.drawable.gato, "Gato", "5"));
        mascota.add(new Mascota(R.drawable.llama, "Llama", "8"));
        mascota.add(new Mascota(R.drawable.lobo, "Lobo", "4"));
        mascota.add(new Mascota(R.drawable.oveja, "Oveja", "7"));
        mascota.add(new Mascota(R.drawable.pollo, "Pollo", "6"));
        mascota.add(new Mascota(R.drawable.tigre, "Tigre", "1"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.menu_opciones, menu);
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return super.onCreateOptionsMenu(menu);
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_Detalle:
                Intent intent = new Intent(this, DetalleMascota.class);
                startActivity(intent);
                break;
            case R.id.mContac:
                Intent a = new Intent(this, Contacto.class);
                startActivity(a);
                break;
            case R.id.mAcerc:
                Intent i = new Intent(this, Acerca.class);
                startActivity(i);
                break;
        }
       return super.onOptionsItemSelected(item);
    }
}
