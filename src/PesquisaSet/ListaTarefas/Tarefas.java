package PesquisaSet.ListaTarefas;

public class Tarefas {
    private String descricao;
    private boolean completa;

    public Tarefas(String descricao, boolean completa) {
        this.descricao = descricao;
        this.completa = completa;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    };

    @Override
    public String toString() {
        
        return "Tarefa: " + descricao + " | Concluida? " + completa ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefas other = (Tarefas) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }
    
    
}