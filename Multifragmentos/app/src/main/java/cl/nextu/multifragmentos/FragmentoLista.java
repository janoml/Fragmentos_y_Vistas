package cl.nextu.multifragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 19-04-2017.
 */

public class FragmentoLista extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragmento_lista,container, false);
        String[] versionesAndroid= new String[]{"Aplle Pie","Banna Bread ","Cupcake","Donut","Eclair"};

        return view;

    }
}
