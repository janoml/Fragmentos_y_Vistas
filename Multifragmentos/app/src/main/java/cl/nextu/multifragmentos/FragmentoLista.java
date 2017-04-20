package cl.nextu.multifragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Admin on 19-04-2017.
 */

public class FragmentoLista extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragmento_lista,container, false);
        String[] versionesAndroid= new String[]{"Aple Pie","Banna Bread ","Cupcake","Donut","Eclair"};

        ArrayAdapter adapter= new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,versionesAndroid);
        ListView  listView= (ListView) view.findViewById(R.id.listViewVersiones);
        listView.setAdapter(adapter);


        return view;

    }
}
