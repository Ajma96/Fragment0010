package es.vcarmen.amacias.fragment010;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Fragment1 extends ListFragment {

    private Callbacks myCallbacks;

    public Fragment1() {
    }

    public interface Callbacks {
        public void onEntradaSeleccionada(String id);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setListAdapter(new Adapter(getActivity(), R.layout.layout_listado, Content.ENT_LISTA) {
            @Override
            public void onEntrada(Object entrada, View view) {

                TextView textoSuperiorEntrada = (TextView) view.findViewById(R.id.texto_titulo);
                textoSuperiorEntrada.setText(((Content.ListaEntrada)entrada).textoEncima);

                ImageView imagenEntrada = (ImageView) view.findViewById(R.id.imagen_lista);
                imagenEntrada.setImageResource(((Content.ListaEntrada)entrada).idImagen);

            }
        });
    }

    private static Callbacks CallbacksVacios = new Callbacks() {
        @Override
        public void onEntradaSeleccionada(String id) {

        }
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        myCallbacks = (Callbacks) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        myCallbacks = CallbacksVacios;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        myCallbacks.onEntradaSeleccionada(Content.ENT_LISTA.get(position).id);
    }
}
