package phobosxd.aeds;

/**
 * @author PhobosXD
 * @since 2021-02-27
 * @version 3.0
 */
public class FilaEstatica extends EstruturaEstatica {
    /**
     * Retorna o elemento da posição desejada.
     *
     * @param position Integer: Posição do elemento.
     * @return Integer: Elemento, quando a posição é válida, ou null, quando a
     * posição não é válida.
     */
    public Integer getElement(final Integer position) {
        if (position >= 0 && position < size) {
            Integer pos = position + primeiro;
            if (pos >= getTam()) {
                pos -= getTam();
            }

            return vector[pos];
        }

        return null;
    }
}
