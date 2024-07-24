import java.util.Set;
import java.util.TreeSet;

/**
 * @author Anthony.Amaz3d
 */

public class Main {
    public static void main(String[] args) {
        listaDeALunos();
    }

    public static void listaDeALunos() {
        Set<String> alunos = new TreeSet<String>();
        String aluno1 = "Anthony Maia Dolberth";
        String aluno2 = "João Francisco";
        String aluno3 = "Maria Luisa";
        String aluno4 = "Isadora Luize";
        String aluno5 = "Edimar Luiz";
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        System.out.println(alunos);
    }
}