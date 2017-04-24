package cl.sawp.fragmentosdinmicos.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.sawp.fragmentosdinmicos.R;

/**
 * Created by HugoAlejandro on 22/04/2017.
 */

public class Email extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.email, container, false);
        String[] emails= new String []{"Elizabeth Quiroga","Vanesa Soto","Magos de Oz","Cony Santamaría",
                "Juanina Ringeler","Josefina del Rio"};
        ArrayAdapter adapter= new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,emails);
        ListView listView= (ListView) view.findViewById(R.id.emailListView);
        listView.setAdapter(adapter);
        return view;
    }

}
