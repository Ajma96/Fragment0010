package es.vcarmen.amacias.fragment010;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment3 extends Fragment {

    public static final String ARG_ID_ENTRADA_SELECCIONADA = "item_id";
    private Content.ListaEntrada myItem;

    public Fragment3() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECCIONADA)) {
            myItem = Content.ENT_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECCIONADA));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.layout_detalle, container, false);

        if (myItem != null) {
            ((TextView)  rootView.findViewById(R.id.texto_titulo_detalle))   .setText(myItem.textoEncima);
            ((TextView)  rootView.findViewById(R.id.texto_contenido_detalle)).setText(myItem.textoDebajo);
            ((ImageView) rootView.findViewById(R.id.imagen_detalle))         .setImageResource(myItem.idImagen);
        }

        return rootView;
    }
}
