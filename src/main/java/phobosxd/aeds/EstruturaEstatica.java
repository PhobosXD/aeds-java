package phobosxd.aeds;

import phobosxd.Status;

/**
 * @author PhobosXD
 * @since 2021-02-27
 * @version 1.0
 */
public interface EstruturaEstatica {
    Integer tam = Status.TAM.getTamanho();
    Integer[] vector = new Integer[tam];

    public Boolean push(final Integer data);

    public Boolean pop();

    public Boolean isEmpty();

    public Integer getSize();
}
