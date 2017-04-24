package cl.sawp.fragmentosdinmicos.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.sawp.fragmentosdinmicos.R;

/**
 * Created by HugoAlejandro on 22/04/2017.
 */

public class CategoriaEmail extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.categorias_email,container,false);
        String[] categoriaEmail= new String[] {"Entrada","Salientes","Destacados", "Borradores", "Basura"};
        ArrayAdapter adapter= new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,categoriaEmail);
        ListView listView= (ListView) view.findViewById(R.id.catEmailListView);
        listView.setAdapter(adapter);

        return  view;
    }
}
