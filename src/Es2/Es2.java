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
}
