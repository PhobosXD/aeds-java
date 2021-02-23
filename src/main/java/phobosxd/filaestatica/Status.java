package phobosxd.filaestatica;

/**
 * @author Cazuza
 * @since 2021-02-23
 * @version 1.0
 */
public enum Status {
    TAM(10);

    private final Integer tamanho;

    Status(final Integer tamanho) {
        this.tamanho = tamanho;
    }

    protected Integer getTamanho() {
        return tamanho;
    }
}
