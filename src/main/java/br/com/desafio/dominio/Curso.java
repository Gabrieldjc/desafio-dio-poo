package br.com.desafio.dominio;

public class Curso extends Conteudo {


    private static int contadorCursos = 0;
    private static int contadorInstrutores = 0;

    private String nome;
    private Instrutor instrutor;
    private int cargaHoraria;

    public Curso() {
        contadorCursos++;
        this.nome = "Curso " + contadorCursos;

        contadorInstrutores++;
        this.instrutor = new Instrutor("Instrutor " + contadorInstrutores);
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
