package cl.sawp.fragmentosdinmicos;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cl.sawp.fragmentosdinmicos.fragmentos.CategoriaEmail;
import cl.sawp.fragmentosdinmicos.fragmentos.Email;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();*/

     // Se crear una instancia la clase fragmento
       /* Email email = new Email();
        fragmentTransaction.add(android.R.id.content, email);
        fragmentTransaction.commit();*/

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        /*Se crear una instancia la clase fragmento  */
        CategoriaEmail catEmail = new CategoriaEmail();
        //fragmentTransaction.add(android.R.id.content, email); muestra el frmaento en un contendor asigando por defecto
        fragmentTransaction.add(R.id.flCategoriaEmail, catEmail); // Aquí lo muestra en el lugar indicado: En el FrmeLayout flFragmento
        fragmentTransaction.commit();

        Button btnFramento = (Button)findViewById(R.id.buttonFragmento);
        btnFramento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarFragmeto(v);
            }
        });


    }

    public void mostrarFragmeto(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        /*Se crear una instancia la clase fragmento  */
        Email email = new Email();
        //fragmentTransaction.add(android.R.id.content, email); muestra el frmaento en un contendor asigando por defecto
        fragmentTransaction.add(R.id.flFragmento, email); // Aquí lo muestra en el lugar indicado: En el FrmeLayout flFragmento
        fragmentTransaction.commit();


    }
}
