import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Orientação a Objetos em Java");
      curso1.setCargaHoraria(85);

      Curso curso2 = new Curso();
      curso2.setTitulo("Curso Js");
      curso2.setDescricao("Orientação a Objetos em Js");
      curso2.setCargaHoraria(80);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("Mentoria de orientação Java");
      mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java");
    bootcamp.setDescricao("Orientacao a Objetos para Devs");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);


    Dev devAline = new Dev();
    devAline.setNome("Aline");
    devAline.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos" + devAline.getConteudoInscrito());
    devAline.progredir();
    System.out.println(".");
    System.out.println("Conteúdos Inscritos" + devAline.getConteudoInscrito());
    System.out.println("Conteúdos Concluidos" + devAline.getConteudoConcluido());
    System.out.println("XP" + devAline.calcularTotalxp());

    System.out.println("............");

    Dev devIsaac = new Dev();
    devIsaac.setNome("Isaac");
    devIsaac.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos" + devIsaac.getConteudoInscrito());
    devIsaac.progredir();
    devIsaac.progredir();
    devIsaac.progredir();
    System.out.println(".");
    System.out.println("Conteúdos Inscritos" + devAline.getConteudoInscrito());
    System.out.println("Conteúdos Concluidos" + devAline.getConteudoInscrito());
    System.out.println("XP" + devIsaac.calcularTotalxp());


    }
}


