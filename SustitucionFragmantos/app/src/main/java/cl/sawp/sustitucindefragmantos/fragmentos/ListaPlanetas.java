package cl.sawp.sustitucindefragmantos.fragmentos;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import cl.sawp.sustitucindefragmantos.BaseDatos;
import cl.sawp.sustitucindefragmantos.R;

/**
 * Created by HugoAlejandro on 24/04/2017.
 */

public class ListaPlanetas extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        BaseDatos baseDeDatos = new BaseDatos();
        ListAdapter listAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, baseDeDatos.planetas);
        setListAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Venus venus = new Venus();

        FragmentTransaction fragmentTransaction = getActivity().getFragmentManager().beginTransaction();

        switch (position) {
            case 0:
                fragmentTransaction.replace(R.id.flListaPlanetas, venus);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }

    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Lista de Planetas");
    }

}





