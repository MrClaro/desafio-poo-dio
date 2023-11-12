import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
         Curso curso1 = new Curso();
         curso1.setTitulo("Curso Java");
         curso1.setDescricao("descrição curso java");
         curso1.setCargaHoraria(8);

         Curso curso2 = new Curso();
         curso2.setTitulo("Curso Spring");
         curso2.setDescricao("descrição curso spring");
         curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev  devAdryan = new Dev();
        devAdryan.setNome("Adryan");
        devAdryan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devAdryan.getConteudosInscritos());
        devAdryan.progredir();
        System.out.println("---------------");

        System.out.println("Conteudos inscritos" + devAdryan.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devAdryan.getConteudosConcluidos());
        System.out.println("XP: " + devAdryan.calcularTotalXP());

        System.out.println("---------------");


        Dev  devGustavo = new Dev();
        devAdryan.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("---------------");

        System.out.println("Conteudos inscritos" + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXP());
    }
}
