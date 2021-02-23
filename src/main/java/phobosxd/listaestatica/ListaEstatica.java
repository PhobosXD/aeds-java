package phobosxd.listaestatica;

import phobosxd.Status;

/**
 * @author PhobosXD
 * @since 2021-02-23
 * @version 1.0
 */
public class ListaEstatica {
    private final Integer tam = Status.TAM.getTamanho();
    private Integer tamanho = 0;
    private Integer inicio = 0;
    private Integer fim = 0;
    private final Integer []vector = new Integer[tam];

    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @param data Integer: Elemento sendo inserido na última posição.
     * @return Boolean: Verdadeiro se o elemento tiver sido inserido. Falso caso
     * contrário.
     */
    public Boolean push_back(final Integer data) {
        if (tamanho < tam) {
            if (tamanho == 0) {
                vector[fim] = data;
            } else if (fim < (tam - 1)) {
                vector[++fim] = data;
            } else {
                fim = 0;
                vector[fim] = data;
            }

            ++tamanho;

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @param data Integer: Elemento sendo inserido na primeira posição.
     * @return Boolean: Verdadeiro se o elemento tiver seido inserido. Falso caso
     * contrário.
     */
    public Boolean push_front(final Integer data) {
        if (tamanho < tam) {
            if (tamanho == 0) {
                vector[inicio] = data;
            } else if (inicio == 0) {
                inicio = tam - 1;
                vector[inicio] = data;
            } else {
                vector[--inicio] = data;
            }

            ++tamanho;

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @param data Integer: Elemento sendo inserido.
     * @param position Integer: Posição da inserção.
     * @return Boolean: Verdadeiro se o elemento tiver sido inserido. Falso caso
     * contrário.
     */
    public Boolean push(final Integer data, final Integer position) {
        if (tamanho < (tam - 1) && position < tamanho && position >= 0) {
            var pos = position + inicio;

            if (pos > tam) {
                pos -= tam;
            }

            var start = fim;

            if (start == (tam - 1)) {
                vector[0] = vector[start];
                --start;
                fim = 0;
            }

            for (int i = start; i >= pos; i--) {
                vector[i + 1] = vector[i];
            }

            vector[pos] = data;
            ++tamanho;

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @return Boolean: Verdadeiro se o primeiro elemento tiver sido excluído.
     * Falso caso contrário.
     */
    public Boolean pop_front() {
        if (tamanho > 0) {
            if (!inicio.equals(fim)) {
                ++inicio;

                if (inicio.equals(tam)) {
                    inicio = 0;
                }
            }

            --tamanho;

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @return Boolean: Verdadeiro caso o último elemento tenha sido excluído.
     * Falso caso contrário.
     */
    public Boolean pop_back() {
        if (tamanho > 0) {
            if (!fim.equals(inicio)) {
                --fim;

                if (fim < 0) {
                    fim = tam - 1;
                }
            }

            --tamanho;

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @param position Integer: posição do elemento.
     * @return Boolean: Verdadeiro caso o elemento tenha sido excluído. Falso caso
     * contrário.
     */
    public Boolean pop(final Integer position) {
        if (tamanho > 0 && position < tamanho && position >= 0) {
            if (!inicio.equals(fim)) {
                var pos = position + inicio;
                if (pos >= tam) {
                    pos -= tam;
                }

                while (pos != fim) {
                    vector[pos] = vector[pos + 1];
                    ++pos;

                    if (pos == tam) {
                        pos = 0;
                    }
                }

                --fim;
                if (fim < 0) {
                    fim = tam - 1;
                }
            }
            --tamanho;

            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PhobosXD
     * @since 2021-02-23
     * @param position Integer: Posição do elemento.
     * @return Integer: Elemento da posição.
     */
    public Integer getElement(final Integer position) {
        if (position < tamanho && position >= 0) {
            var pos = position + inicio;
            if (pos >= tam) {
                pos -= tam;
            }

            return vector[pos];
        } else {
            return null;
        }
    }

    public Integer getTamanho() {
        return tamanho;
    }
}
