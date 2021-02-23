package phobosxd.filaestatica;

/**
 * @author Cazuza
 * @since 2021-02-23
 * @version 1.1
 */
public class FilaEstatica {
    private final Integer tam = Status.TAM.getTamanho();
    private Integer []vector = new Integer [tam];
    private Integer inicio = 0;
    private Integer fim = 0;
    private Integer tamanho = 0;

    /**
     * @author Cazuza
     * @since 2021-02-23
     * @param data Integer: dado a ser inserido.
     * @return Boolean: retorna verdadeiro se for possível inserir o dado. Falso caso
     * contrário.
     */
    public Boolean push(final Integer data) {
        if (tamanho < tam) {
            ++tamanho;
            vector[fim++] = data;

            if (fim.equals(tam)) {
                fim = 0;
            }

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author Cazuza
     * @since 2021-02-23
     * @return Boolean: retorna true caso tenha excluído o elemento.
     */
    public Boolean pop() {
        if (tamanho > 0) {
            --tamanho;
            ++inicio;

            if (inicio.equals(tam)) {
                inicio = 0;
            }

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author Cazuza
     * @since 2021-02-23
     * @param posicao Integer: posição do elemento acessado.
     * @return Integer: retorna o elemento caso ele exista. Retorna 0 caso o elemento
     * não exista.
     */
    public Integer getElement(final Integer posicao) {
        if (posicao < tamanho) {
            var pos = posicao + inicio;

            if (pos >= tam) {
                pos -= tam;
            }

            return vector[pos];
        } else {
            return 0;
        }
    }

    /**
     * @author Cazuza
     * @since 2021-02-23
     * @return Integer: tamanho da fila.
     */
    public Integer getTamanho() {
        return tamanho;
    }
}
