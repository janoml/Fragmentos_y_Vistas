package cl.sawp.u1l2e2_fragmentosestaticos.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.sawp.u1l2e2_fragmentosestaticos.R;

/**
 * Created by HugoAlejandro on 20/04/2017.
 */

public class InicioSesion extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_inicio_sesion,container, false);
        return view;
    }
}
