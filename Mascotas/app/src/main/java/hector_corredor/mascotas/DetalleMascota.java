package hector_corredor.mascotas;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import hector_corredor.mascotas.Adapter.MascotaAdaptador;
import hector_corredor.mascotas.Adapter.PageAdapter;
import hector_corredor.mascotas.fragment.PerfilFragment;
import hector_corredor.mascotas.fragment.RecicleviewFragment;
import hector_corredor.mascotas.pojo.Mascota;

public class DetalleMascota extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        toolbar =(Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager =(ViewPager) findViewById(R.id.viewPaper);
        setUpViewPager();


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionbar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

    }


    private ArrayList<Fragment> agregarFragments () {
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecicleviewFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager () {
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_mascota);
    }



}
