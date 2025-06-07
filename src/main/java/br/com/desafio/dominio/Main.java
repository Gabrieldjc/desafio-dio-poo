package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso de Java do zero ao avançado");
        curso1.setCargaHoraria(56);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Curso de JS Front-End");
        curso2.setCargaHoraria(30);

        System.out.println(curso1.getNome());
        System.out.println(curso1.getInstrutor().getNome());

        System.out.println();

        System.out.println(curso2.getNome());
        System.out.println(curso2.getInstrutor().getNome());

        System.out.println();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria sobre Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Gabriel " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Gabriel " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Gabriel " + devGabriel.getConteudosConcluidos());
        System.out.println("XP:" + devGabriel.calcularTotalXP());

        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de João " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());

        if (devGabriel.concluiuOBootcamp(bootcamp)) {
            System.out.println("Avalie o curso: ");
            Scanner scanner = new Scanner(System.in);
            int avaliar = scanner.nextInt();
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.validarNota(avaliar);
            System.out.println("Sua avaliação para a qualidade do curso foi a nota: " + avaliar);
        }

        if (devJoao.concluiuOBootcamp(bootcamp)) {
            System.out.println("Avalie o curso: ");
            Scanner scanner = new Scanner(System.in);
            int avaliar = scanner.nextInt();
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.validarNota(avaliar);
            System.out.println("Sua avaliação para a qualidade do curso foi a nota: " + avaliar);
        }
    }
}