package OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    // atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }

    // Metodo para adicionar convidado
    public void adicionarConvidadoSet(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                System.out.println("O convidado " + c.getNome() + " ID: " + c.getCodigoConvite() + " foi removido");
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();

    }

    public void exibirConvidados() {
        for (Convidado c : convidadoSet) {
            System.out.println("Convidado: " + c.getNome() + " ID: " + c.getCodigoConvite());
        }
    }

  
    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado(null);


        conjuntoConvidado.adicionarConvidadoSet("Alice Silva", 123456);
        //conjuntoConvidado.adicionarConvidadoSet("Bruno Pereira", 789012);
        //conjuntoConvidado.adicionarConvidadoSet("Carla Oliveira", 345678);
        conjuntoConvidado.adicionarConvidadoSet("Daniel Souza", 123456);
        //conjuntoConvidado.adicionarConvidadoSet("Eduarda Lima", 567890);
        //conjuntoConvidado.adicionarConvidadoSet("Fernando Alves", 234567);
        conjuntoConvidado.adicionarConvidadoSet("Gabriela Costa", 890123);
        conjuntoConvidado.adicionarConvidadoSet("Henrique Fernandes", 456789);
        //conjuntoConvidado.adicionarConvidadoSet("Isabela Rocha", 123890);
        //conjuntoConvidado.adicionarConvidadoSet("João Ribeiro", 678901);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " para o evento");
        conjuntoConvidado.exibirConvidados();
        System.out.println("_________________________");
        conjuntoConvidado.removerConvidadoPorCodigoConvite(901234);
        conjuntoConvidado.removerConvidadoPorCodigoConvite(123456);

        System.out.println("_________________________");
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " para o evento");
        conjuntoConvidado.exibirConvidados();
        System.out.println("_________________________");
    }

}
