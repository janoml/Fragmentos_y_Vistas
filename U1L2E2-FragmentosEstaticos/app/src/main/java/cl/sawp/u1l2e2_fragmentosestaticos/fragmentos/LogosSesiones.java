package cl.sawp.u1l2e2_fragmentosestaticos.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.sawp.u1l2e2_fragmentosestaticos.R;

/**
 * Created by HugoAlejandro on 20/04/2017.
 */

public class LogosSesiones extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragemento_logo_sesiones,container, false);

        return view;

    }
}
