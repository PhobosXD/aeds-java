package phobosxd;

import phobosxd.filaestatica.FilaEstatica;
import phobosxd.listaestatica.ListaEstatica;

/**
 * @author Cazuza
 * @since 2021-02-23
 * @version 1.0
 */
public class Main {
    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        final var lista = new ListaEstatica();

        for (int i = 0; i < 10; i++) {
            if (!lista.push_back(i)) {
                System.out.println("Nao foi possivel inserir na fila!");
            }
        }

        lista.pop_front();
        lista.pop_front();
        lista.push(0, 1);
        lista.push_front(1);
        lista.pop_back();
        lista.pop(3);

        for (Integer i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.getElement(i));
        }
    }
}
