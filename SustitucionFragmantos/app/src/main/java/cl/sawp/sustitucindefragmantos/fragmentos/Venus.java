package cl.sawp.sustitucindefragmantos.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.sawp.sustitucindefragmantos.R;

/**
 * Created by HugoAlejandro on 24/04/2017.
 */

public class Venus extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.venus,container, false);
        return view;

    }
}
