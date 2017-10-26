package es.vcarmen.amacias.fragment010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Content {

    public static ArrayList<ListaEntrada>   ENT_LISTA         = new ArrayList<ListaEntrada>();
    public static Map<String, ListaEntrada> ENT_LISTA_HASHMAP = new HashMap<String, ListaEntrada>();

    public static class ListaEntrada {

        public String id;
        public int    idImagen;
        public String textoEncima;
        public String textoDebajo;

        public ListaEntrada(String id, int idImagen, String textoEncima, String textoDebajo) {

            this.id          = id;
            this.idImagen    = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
        }

    }

    public static void aniadirEntrada(ListaEntrada listaEntrada) {

        ENT_LISTA.add(listaEntrada);
        ENT_LISTA_HASHMAP.put(listaEntrada.id, listaEntrada);
    }

    static {
        aniadirEntrada(new ListaEntrada("0", R.drawable.boticelli,  "BOTICELLI",    "Buenas esculturas"));
        aniadirEntrada(new ListaEntrada("1", R.drawable.caravaggio, "CARAVAGGIO",   "Otro pintor italiano"));
        aniadirEntrada(new ListaEntrada("2", R.drawable.leonardo,   "LEONARDO",     "Genio del Renacimiento"));
        aniadirEntrada(new ListaEntrada("3", R.drawable.miguelangel,"MIGUEL ÁNGEL", "Bernini tus muertos pisoteaos"));
        aniadirEntrada(new ListaEntrada("4", R.drawable.rafael,     "RAFAEL",       "Otro pintor italiano mu majo"));
        aniadirEntrada(new ListaEntrada("5", R.drawable.rembrant,   "REMBRANT",     "Me suena el nombre pero ni idea de este pavo"));
        aniadirEntrada(new ListaEntrada("6", R.drawable.renoir,     "RENOIR",       "Otro que me suena pero ni idea"));
        aniadirEntrada(new ListaEntrada("7", R.drawable.velazquez,  "VELAZQUEZ",    "Pintor español autor de \"Las meninas\""));
    }

}
