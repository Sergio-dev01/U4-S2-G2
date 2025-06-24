package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Es2 {

    public static List<Integer> generaListaOrdinata(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> invertiLista(List<Integer> lista) {
        // 1) Creo una nuova lista
        List<Integer> nuovaLista = new ArrayList<>();

        // 2) Copio lista nella nuova lista
        nuovaLista.addAll(lista);

        // 3) Aggiungo alla lista nuova la lista vecchia invertita
        for (int i = lista.size() - 1; i >= 0; i--) {
            nuovaLista.add(lista.get(i));
        }

        return nuovaLista;
        // 4) ritorno la nuova lista piena


    }


}
