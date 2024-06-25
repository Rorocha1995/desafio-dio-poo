import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();
        Mentoria mentoria1 = new Mentoria();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso sobre java");
        curso.setCargaHoraria(8);
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Curso sobre pyhton");
        curso1.setCargaHoraria(20);

        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("mentoria sobre java");
        mentoria.setData(LocalDate.now());
        mentoria1.setTitulo("mentoria Pyhton");
        mentoria1.setDescricao("mentoria sobre Python");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println(devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        System.out.println(devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());



        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Concluidos  " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}