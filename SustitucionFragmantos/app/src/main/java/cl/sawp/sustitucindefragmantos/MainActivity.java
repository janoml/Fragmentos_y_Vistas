package cl.sawp.sustitucindefragmantos;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cl.sawp.sustitucindefragmantos.fragmentos.ListaPlanetas;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        ListaPlanetas listaDePlanetas = new ListaPlanetas();
        /**Se mustra el framento listaDePlanetas en el FrameLayout flListaPlanetas*/
        fragmentTransaction.add(R.id.flListaPlanetas, listaDePlanetas);
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
