package PesquisaSet.AgenciaContato;

import java.util.HashSet;
import java.util.Set;

public class AgenciaContato {
    private Set<Contato> contatos;

    public AgenciaContato() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> resultadoPesquisaNome = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().startsWith(nome)) {
                resultadoPesquisaNome.add(c);
            }
        }
        return resultadoPesquisaNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgenciaContato agenda = new AgenciaContato();

        agenda.adicionarContato("Alexandre Borges", 40028922);
        agenda.adicionarContato("Alexandre Melo", 40028922);
        agenda.adicionarContato("Maria", 99887766);
        agenda.adicionarContato("João", 91234567);
        agenda.adicionarContato("Ana", 87654321);
        agenda.adicionarContato("Carlos", 33445566);
        agenda.adicionarContato("Beatriz", 44556677);
        System.out.println("_________________________");
        System.out.println(agenda.pesquisarPorNome("Alexandre"));
        agenda.atualizarNumeroContato("Alexandre Melo", 66666666);
        System.out.println(agenda.pesquisarPorNome("Alexandre"));

    }
}
