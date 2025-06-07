package br.com.desafio.dominio;

public class Avaliacao {

    int nota;

    public boolean validarNota(int nota) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("Nota inválida, por favor digite uma nota de 1 a 5");
        }
        return true;
    }
}
