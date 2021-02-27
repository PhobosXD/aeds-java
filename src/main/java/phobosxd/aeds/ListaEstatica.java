package phobosxd.aeds;

public class ListaEstatica extends EstruturaEstatica {
    /**
     * Insere um elemento em qualquer posição da estrutura.
     *
     * @param data Integer: Elemento sendo inserido.
     * @param position Integer: Posição de inserção.
     * @return Boolean: Verdadeiro caso o elemento tenha sido inserido. Falso caso
     * a estrutura esteja cheia.
     */
    public Boolean push(final Integer data, final Integer position) {
        if (size < getTam() && position >= 0 && position < size) {
            Integer pos = position + primeiro;
            if (pos >= getTam()) {
                pos -= getTam();
            }

            Integer it = ultimo;
            while (!it.equals(pos - 1)) {
                if (it.equals(getTam() - 1)) {
                    vector[0] = vector[it];
                } else {
                    vector[it + 1] = vector[it];
                }

                it = it == 0 ? (getTam() - 1) : (it - 1);
            }

            vector[pos] = data;
            ++size;

            ultimo = ultimo == (getTam() - 1) ? 0 : (ultimo + 1);

            return true;
        }

        return false;
    }

    public Boolean push_front(final Integer data) {
        if (size < getTam()) {
            primeiro = primeiro == 0 ? (getTam() - 1) : (primeiro - 1);

            vector[primeiro] = data;
            ++size;

            return true;
        }

        return false;
    }

    public Boolean pop(final Integer position) {
        if (size > 0 && position >= 0 && position < size) {
            Integer pos = position + primeiro;
            if (pos >= getTam()) {
                pos -= getTam();
            }

            while (!pos.equals(ultimo)) {
                vector[pos] = vector[pos + 1];
                pos = pos == (getTam() - 1) ? 0 : (pos + 1);
            }

            ultimo = ultimo == 0 ? (getTam() -1) : (ultimo - 1);
            --size;

            return true;
        }

        return false;
    }

    public Boolean pop_back() {
        if (size > 0) {
            if (size > 1) {
                ultimo = ultimo == 0 ? (getTam() - 1) : (ultimo - 1);
            }
            --size;

            return true;
        }

        return false;
    }

    public Integer getElement(final Integer position) {
        if (size > 0 && position >= 0 && position < size) {
            Integer pos = position + primeiro;
            if (pos >= getTam()) {
                pos -= getTam();
            }

            return vector[pos];
        }

        return null;
    }
}
