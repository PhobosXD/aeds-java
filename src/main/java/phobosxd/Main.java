package phobosxd;

import phobosxd.filaestatica.FilaEstatica;

/**
 * @author Cazuza
 * @since 2021-02-23
 * @version 1.0
 */
public class Main {
    /**
     * @author Cazuza
     * @since 2021-02-23
     * @param args Argumentos da main.
     */
    public static void main(String[] args) {
        final var fila = new FilaEstatica();

        for (int i = 0; i < 10; i++) {
            if (!fila.push(i)) {
                System.out.println("Nao foi possivel inserir na fila!");
            }
        }

        fila.pop();
        fila.pop();
        fila.push(10);
        fila.push(11);

        for (Integer i = 0; i < fila.getTamanho(); i++) {
            System.out.println(fila.getElement(i));
        }
    }
}
