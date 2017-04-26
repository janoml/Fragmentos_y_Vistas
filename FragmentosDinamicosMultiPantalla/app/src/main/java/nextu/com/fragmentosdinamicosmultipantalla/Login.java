package nextu.com.fragmentosdinamicosmultipantalla;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Next University.
 */
public class Login extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Login");
    }
}
