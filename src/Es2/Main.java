package Es2;

import java.util.List;

import static Es2.Es2.generaListaOrdinata;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        // Funzione 1
        List<Integer> listaOrdinata = generaListaOrdinata(n);
        System.out.println("Lista ordinata di numeri casuali:");
        System.out.println(listaOrdinata);


    }
}

