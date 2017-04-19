package cl.nextu.introduccinfragmentosyvistas;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 19-04-2017.
 */

public class Ej1Fragmento extends Fragment {
    private final String MENSAJE = "mensaje";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.wtf(MENSAJE, "oNCreate");


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ej1_fragmento, container, false);
        Log.wtf(MENSAJE, "oNCreateView");
        return view;


        // return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.wtf(MENSAJE, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.wtf(MENSAJE, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.wtf(MENSAJE, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.wtf(MENSAJE, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.wtf(MENSAJE, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.wtf(MENSAJE, "onDestryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf(MENSAJE, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.wtf(MENSAJE, "onDetach");
    }


}
