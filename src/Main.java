import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso sobre java");
        curso.setCargaHoraria(8);
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("mentoria sobre java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso);

    }
}