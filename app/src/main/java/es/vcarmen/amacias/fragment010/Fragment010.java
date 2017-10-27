package es.vcarmen.amacias.fragment010;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Fragment010 extends FragmentActivity implements Fragment1.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment010);
    }


    @Override
    public void onEntradaSeleccionada(String id) {
        Toast.makeText(getBaseContext(), "Tocado el elemento " + id, Toast.LENGTH_SHORT).show();

        Intent detalleIntent = new Intent(this, Fragment2.class);
        detalleIntent.putExtra(Fragment3.ARG_ID_ENTRADA_SELECCIONADA, id);
        startActivity(detalleIntent);
    }
}
