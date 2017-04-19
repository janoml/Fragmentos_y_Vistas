package cl.nextu.introduccinfragmentosyvistas;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Admin on 19-04-2017.
 */

public class Ej1Fragmento extends Fragment {
    private final String MENSAJE = "mensaje";
    Context context = getActivity();
    int duration = Toast.LENGTH_SHORT;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText( getActivity(), "onAttach", Toast.LENGTH_SHORT).show();
       // Log.wtf(MENSAJE,"onAtach");
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Log.wtf(MENSAJE, "oNCreate");
        Toast.makeText( getActivity(), "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ej1_fragmento, container, false);
       // Log.wtf(MENSAJE, "oNCreateView");
        Toast.makeText( getActivity(), "onCreateView", Toast.LENGTH_SHORT).show();
        return view;


        // return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
      //  Log.wtf(MENSAJE, "onActivityCreated");
        Toast.makeText( getActivity(), "onActivityCreated", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStart() {
        super.onStart();
        //Log.wtf(MENSAJE, "onStart");
        Toast.makeText( getActivity(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
       // Log.wtf(MENSAJE, "onResume");
        Toast.makeText( getActivity(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        //Log.wtf(MENSAJE, "onPause");
        Toast.makeText( getActivity(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        //Log.wtf(MENSAJE, "onStop");
        Toast.makeText( getActivity(), "onAttach", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //Log.wtf(MENSAJE, "onDestryView");
        Toast.makeText( getActivity(), "onDetryView", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
       // Log.wtf(MENSAJE, "onDestroy");
        Toast.makeText( getActivity(), "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        //Log.wtf(MENSAJE, "onDetach");
        Toast.makeText( getActivity(), "onDetach", Toast.LENGTH_SHORT).show();
    }


}
