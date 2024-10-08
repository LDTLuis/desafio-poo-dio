import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Neste curso de introdução à linguagem Java, você aprenderá os conceitos fundamentais da programação orientada a objetos, estrutura de dados e desenvolvimento de aplicações.");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Este curso de JavaScript é ideal para quem deseja dominar a principal linguagem de programação para desenvolvimento web.");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("A mentoria de Java é voltada para programadores que desejam aprimorar suas habilidades e acelerar seu desenvolvimento na linguagem.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("O Bootcamp Java Developer é um programa intensivo de formação voltado para quem deseja se tornar um desenvolvedor Java completo. Durante o curso, você aprenderá desde os conceitos básicos da linguagem até tópicos avançados, como estruturas de dados, algoritmos, desenvolvimento de APIs, integração com bancos de dados e frameworks essenciais, como Spring Boot.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Luis");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Profile: " + dev1.getNome());
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        System.out.println("\n--Atualização--\n");

        System.out.println("Profile: " + dev1.getNome());
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("\n---------------------\n");

        Dev dev2 = new Dev();
        dev2.setNome("Paulo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Profile: " + dev2.getNome());
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("\n--Atualização--\n");

        System.out.println("Profile: " + dev2.getNome());
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }

}
