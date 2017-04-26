package cl.sawp.sustitucindefragmentosv12.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.sawp.sustitucindefragmentosv12.R;

/**
 * Created by Admin on 26-04-2017.
 */

public class LogoLombarghini extends Fragment {
    public LogoLombarghini() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //  return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.logo_lamborghini, container, false);
        return view;
    }

}
