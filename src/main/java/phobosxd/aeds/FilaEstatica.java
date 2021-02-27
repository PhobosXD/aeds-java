package phobosxd.aeds;

/**
 * @author PhobosXD
 * @since 2021-02-27
 * @version 2.0
 */
public class FilaEstatica implements EstruturaEstatica {
    private Integer inicio = 0;
    private Integer fim = 0;
    private Integer size = 0;

    /**
     * Insere um elemento ao fim da fila.
     *
     * @param data Integer: Elemento a ser inserido.
     * @return Boolean: Verdadeiro caso o elemento tenha sido inserido. Falso caso
     * a fila esteja cheia.
     */
    @Override
    public Boolean push(Integer data) {
        if (size < tam) {
            if (size > 0) {
                ++fim;

                if (fim == tam) {
                    fim = 0;
                }
            }
            vector[fim] = data;
            ++size;

            return true;
        }

        return false;
    }

    /**
     * Retira o primeiro elemento da fila.
     *
     * @return Boolean: Verdadeiro caso o elemento tenha sido retirado. Falso caso
     * a fila esteja vazia.
     */
    @Override
    public Boolean pop() {
        if (size > 0) {
            if (size > 1) {
                ++inicio;

                if (inicio == tam) {
                    inicio = 0;
                }
            }
            --size;

            return true;
        }

        return false;
    }

    @Override
    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    public void clear() {
        fim = inicio;
        size = 0;
    }

    /**
     * Retorna o elemento da posição desejada.
     *
     * @param posicao Integer: Posição do elemento.
     * @return Integer: Retorna o elemento para qualquer posição válida e null para
     *                  posições inválidas.
     */
    public Integer getElement(final Integer posicao) {
        if (posicao >= 0 && posicao < size) {
            Integer pos = posicao + inicio;
            if (pos >= tam) {
                pos -= tam;
            }

            return vector[pos];
        }

        return null;
    }
}
