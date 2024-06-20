Java Set Collections

## Introdução

No mundo do Java, as coleções são ferramentas poderosas que ajudam a organizar e gerenciar dados de forma eficiente. Entre as várias coleções disponíveis, o **Set** se destaca por sua capacidade de armazenar elementos únicos, ou seja, sem duplicatas. Este README abordará o que é um **Set**, bem como duas de suas implementações mais utilizadas: **HashSet** e **TreeSet**.

## O que é um Set?

Um **Set** é uma coleção que não permite elementos duplicados. Ele é ideal para quando você precisa garantir que cada item em sua coleção seja único. Os elementos em um Set não têm uma ordem específica.

### Características Principais

- **Unicidade**: Não permite elementos duplicados.
- **Operações rápidas**: Tipicamente, as operações de inserção, remoção e busca são rápidas.
- **Iteração**: A ordem de iteração não é garantida (exceto para implementações específicas como TreeSet).

## HashSet

O **HashSet** é uma das implementações mais populares de Set. Ele é baseado em uma tabela hash, o que permite operações de inserção, remoção e busca muito rápidas, geralmente em tempo constante.

### Características do HashSet

- **Complexidade**: Operações básicas (inserção, remoção e busca) têm complexidade O(1) na maioria dos casos.
- **Ordem**: Não mantém nenhuma ordem específica dos elementos.
- **Elementos**: Permite um único elemento nulo.

### Exemplo de Uso

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Maçã"); // Este elemento duplicado será ignorado

        System.out.println(set); // Saída: [Maçã, Banana, Laranja]
    }
}
```

## TreeSet

O **TreeSet** é outra implementação de Set, que utiliza uma árvore para armazenar os elementos. Isso garante que os elementos sejam armazenados em ordem natural ou por um comparador fornecido.

### Características do TreeSet

- **Complexidade**: Operações básicas (inserção, remoção e busca) têm complexidade O(log n).
- **Ordem**: Mantém os elementos em ordem crescente.
- **Elementos**: Não permite elementos nulos.

### Exemplo de Uso do TreeSet

```java
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Maçã"); // Este elemento duplicado será ignorado

        System.out.println(set); // Saída: [Banana, Laranja, Maçã]
    }
}
```

## Conclusão

Os Sets são coleções poderosas e úteis no Java para garantir que não existam elementos duplicados. Tanto **HashSet** quanto **TreeSet** oferecem funcionalidades específicas que podem ser escolhidas conforme a necessidade do seu programa. O HashSet é ótimo para desempenho rápido sem ordem, enquanto o TreeSet é útil quando você precisa que os elementos estejam em uma ordem específica.
