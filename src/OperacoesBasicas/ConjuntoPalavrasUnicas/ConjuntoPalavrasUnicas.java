package OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra> palavras;

    public ConjuntoPalavrasUnicas(Set<Palavra> palavras) {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavras(String Palavra) {
        palavras.add(new Palavra(Palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraremovida = null;
        for (Palavra p : palavras) {
            if (p.getPalavra() == palavra) {
                palavraremovida = p;
                System.out.println("A palavra " + p.getPalavra() + " está sendo removida!");
                break;
            }
        }
        palavras.remove(palavraremovida);
    }

    public void verificarPalavra(String palavra) {
        boolean checarPalavra = false;
        for (Palavra p : palavras) {
            if (p.getPalavra().equals(palavra)) {
                checarPalavra = true;
                break;
            }
        }
        if (checarPalavra) {
            System.out.println("A palavra foi encontrada");
        } else {
            System.out.println("A palavra não foi encontrada");
        }
    }
    public void exibirPalavras(){
        for (Palavra p : palavras){
            System.out.println(p);
        }
    }
    public void quantidadePalavras(){
        System.out.println(palavras.size());
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavritas = new ConjuntoPalavrasUnicas(null);

        palavritas.adicionarPalavras("banana");
        palavritas.adicionarPalavras("maçã");
        palavritas.adicionarPalavras("laranja");
        palavritas.adicionarPalavras("uva");
        palavritas.adicionarPalavras("abacaxi");
        palavritas.adicionarPalavras("melancia");
        palavritas.adicionarPalavras("manga");
        palavritas.adicionarPalavras("pera");
        palavritas.adicionarPalavras("kiwi");
        palavritas.adicionarPalavras("morango");
        palavritas.adicionarPalavras("limão");
        palavritas.adicionarPalavras("limão");
        palavritas.adicionarPalavras("limão");
        palavritas.adicionarPalavras("limão");
        palavritas.adicionarPalavras("limão");

        palavritas.verificarPalavra("laranja");
        palavritas.verificarPalavra("maracujá");
        palavritas.removerPalavra("uva");
        palavritas.exibirPalavras();
        palavritas.quantidadePalavras();
        
    }

}