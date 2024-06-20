package PesquisaSet.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefas> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }
    // Metodo para adicionar tarefas:

    public void adicionarTarefa(String descricao, boolean completa) {
        tarefas.add(new Tarefas(descricao, completa));
    }

    // Metodo para remover tarefas:
    public void removerTarefas(String descricao) {
        Tarefas tarefasRemovida = null;
        for (Tarefas t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemovida = t;
                System.out.println("A tarefa " + t.getDescricao() + " está sendo removida!");
                break;
            }
        }
        tarefas.remove(tarefasRemovida);
    }

    // Método para exibir tarefas
    public void exibirTarefas() {
        for (Tarefas t : tarefas) {
            System.out.println(t);
        }
    }
//Método que conta as tarefas
    public void contarTarefas() {
        System.out.println("Quantidade de tarefas: " + tarefas.size());
    }
// Método que obtem as tarefas concluidas
    public void obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas t : tarefas) {
            if (t.isCompleta()) {
                tarefasConcluidas.add(t);
            }

        }
        System.out.println(tarefasConcluidas);
    }
// Método que obtem as tarefas pendentes
    public void obterTarefasPendentes() {
        Tarefas tarefasPendentes = null;
        for (Tarefas t : tarefas) {
            if (!t.isCompleta()) {
                tarefasPendentes = t;
            }

        }
        System.out.println(tarefasPendentes);
    }
// Metodo que marca como concluída
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefas t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isCompleta()) {
                t.setCompleta(true);

            }
        }
    }
// Metodo que marca como pendente
    public void marcarTarefaPendente(String descricao) {
        for (Tarefas t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && t.isCompleta()) {
                t.setCompleta(false);
            }
        }
    }
    //Método que limpa a lista de tarefas
    public void limparListaTarefas(){
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas tasks = new ListaTarefas();
        tasks.adicionarTarefa("Comprar comida", true);
        tasks.adicionarTarefa("Comprar droga", false);
        tasks.adicionarTarefa("Comprar armas", false);
        tasks.exibirTarefas();
        tasks.marcarTarefaConcluida("Comprar armas");
        System.out.println("___________");
        //tasks.obterTarefasConcluidas();
        tasks.limparListaTarefas();
        tasks.exibirTarefas();
    }

}
