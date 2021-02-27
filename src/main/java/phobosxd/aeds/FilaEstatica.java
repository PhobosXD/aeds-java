package phobosxd.aeds;

public class FilaEstatica extends EstruturaEstatica {
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
