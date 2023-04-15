import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gustavo:" + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Gustavo:" + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Gustavo:" + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
