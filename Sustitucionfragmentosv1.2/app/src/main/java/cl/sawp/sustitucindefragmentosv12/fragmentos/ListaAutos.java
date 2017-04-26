package cl.sawp.sustitucindefragmentosv12.fragmentos;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import cl.sawp.sustitucindefragmentosv12.R;
import cl.sawp.sustitucindefragmentosv12.bd.BaseDatos;

/**
 * Created by Admin on 25-04-2017.
 */

public class ListaAutos extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        BaseDatos baseDeDatos = new BaseDatos();
        ListAdapter listAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, baseDeDatos.titulosAutos);
        setListAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

          LogoFerrari logoFerrari = new LogoFerrari();
          Fragment fragment= new Fragment();
          FragmentTransaction fragmentTransaction = getActivity().getFragmentManager().beginTransaction();

        switch (position) {
            case 0:
                fragment= new LogoFerrari();
                break;
            case 1:
                fragment= new LogoLombarghini();
                break;
            default:
                break;
        }

        fragmentTransaction.replace(R.id.flListaAutos, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Lista de marcas");
    }

}
