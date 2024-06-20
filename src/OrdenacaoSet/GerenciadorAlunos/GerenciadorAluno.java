package OrdenacaoSet.GerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    Set<Aluno> alunos;

    public GerenciadorAluno() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int i, double media) {
        alunos.add(new Aluno(nome, i, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemove = null;
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                alunoRemove = a;
                break;
            }
        }
        alunos.remove(alunoRemove);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunoPorMedia() {
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorNota());
        alunosPorMedia.addAll(alunos);
        return alunosPorMedia;
    }

    public void exibirAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        GerenciadorAluno escola = new GerenciadorAluno();
        escola.adicionarAluno("Alexandre Melo", 255645152, 9.5);
        escola.adicionarAluno("Maria Silva", 123456789, 8.7);
        escola.adicionarAluno("João Souza", 987654321, 7.3);
        escola.adicionarAluno("Ana Pereira", 112233445, 9.0);
        escola.adicionarAluno("Carlos Lima", 998877665, 6.5);
        escola.adicionarAluno("Beatriz Oliveira", 556677889, 10.0);
        escola.exibirAlunos();
        System.out.println("Ordem Alfabética: ");
        System.out.println(escola.exibirAlunosPorNome());
        System.out.println("Ordem das Médias: ");
        System.out.println(escola.exibirAlunoPorMedia());

    }

}
