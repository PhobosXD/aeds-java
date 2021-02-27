package phobosxd.aeds;

import phobosxd.Status;

public abstract class EstruturaEstatica {
    private final Integer tam = Status.TAM.getTamanho();
    protected final Integer[] vector = new Integer[tam];
    protected Integer primeiro = 0;
    protected Integer ultimo = 0;
    protected Integer size = 0;

    protected Integer getTam() {
        return tam;
    }

    public Boolean push(final Integer data) {
        if (size < tam) {
            if (size > 0) {
                ++ultimo;

                if (ultimo.equals(tam)) {
                    ultimo = 0;
                }
            }
            vector[ultimo] = data;
            ++size;

            return true;
        }

        return false;
    }

    public Boolean pop() {
        if (size > 0) {
            if (size > 1) {
                ++primeiro;

                if (primeiro.equals(tam)) {
                    primeiro = 0;
                }
            }
            --size;

            return true;
        }

        return false;
    }

    public Integer getSize() {
        return size;
    }
}
