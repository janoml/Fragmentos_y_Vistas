package cl.sawp.sustitucindefragmentosv12;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cl.sawp.sustitucindefragmentosv12.fragmentos.ListaAutos;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        ListaAutos listaAutos = new ListaAutos();
        /**Se mustra el framento listaDePlanetas en el FrameLayout flListaPlanetas*/
        fragmentTransaction.add(R.id.flListaAutos, listaAutos);
        fragmentTransaction.commit();

    }

    @Override
    public void onBackPressed() {
        if(getFragmentManager().getBackStackEntryCount()>0){
            getFragmentManager().popBackStack();
        }
        else{
            super.onBackPressed();
        }
    }
}
