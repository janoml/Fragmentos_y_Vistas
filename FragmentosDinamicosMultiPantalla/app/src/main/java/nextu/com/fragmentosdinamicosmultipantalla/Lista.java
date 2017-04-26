package nextu.com.fragmentosdinamicosmultipantalla;

import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Next University.
 */
public class Lista extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        String [] listaDeOpciones = getResources().getStringArray(R.array.opciones);

        ListAdapter listAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, listaDeOpciones);
        setListAdapter(listAdapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Login login = new Login();
        Ayuda ayuda = new Ayuda();

        FragmentTransaction fragmentTransaction =
                getActivity().getFragmentManager().beginTransaction();

        switch (position){
            case 0:
                fragmentTransaction.replace(R.id.dinamico, login);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case 1:
                fragmentTransaction.replace(R.id.dinamico, ayuda);
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
        getActivity().setTitle("Inicio");
    }
}
