package phobosxd.listaestatica;

import phobosxd.Status;

public class ListaEstatica {
    private final Integer tam = Status.TAM.getTamanho();
    private Integer tamanho=0;
    private Integer inicio=0;
    private Integer fim=0;
    private Integer []vector = new Integer[tam];

    public Boolean push_back(final Integer data) {
        if (tamanho < tam) {
            if (tamanho == 0) {
                vector[fim] = data;
            } else if (fim < (tam-1)) {
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

    public Boolean push(final Integer data, final Integer position) {
        if (inicio < fim) {
            if (position > inicio && position < fim) {
                
            }
        }
    }
}
