package OrdenacaoSet.CadastroProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
       produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastro = new CadastroProduto();
        cadastro.adicionarProduto(444222, "Manga", 5.22, 1);
        cadastro.adicionarProduto(123456, "Banana", 2.50, 10);
        cadastro.adicionarProduto(789012, "Maçã", 3.75, 20);

System.out.println(cadastro.exibirProdutosPorNome());
System.out.println(cadastro.exibirPorPreco());
    }
}
