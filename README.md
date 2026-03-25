# Estruturas de Dados Lineares: Pilha e Fila (Java)

Este repositório contém implementações autorais de duas estruturas de dados fundamentais: Pilha (Stack) e Fila (Queue). Ambas foram desenvolvidas em Java utilizando arrays genéricos com capacidade dinâmica.


As implementações foram desenvolvidas manualmente ou seja, usando arrays  simples nativas , sem uso de estruturas prontas, com foco em compreender o funcionamento interno e aplicar boas práticas de programação.

## Linguagens Utilizadas
   * Java
   * Python

## Paradigma: 
   * Orientação a Objetos

## Conceitos: 
   * Generics, Redimensionamento Dinâmico (Dynamic Resizing)

 ## Estruturas Implementadas
 
### 1. Pilha (Stack)
A Pilha segue o princípio LIFO (Last In, First Out), onde o último elemento a entrar é o primeiro a sair.

Métodos Principais:

*  push(T item): Adiciona um elemento ao topo.
*  pop(): Remove e retorna o elemento do topo.
*  peek(): Retorna o topo sem removê-lo.
*  isEmpty(): Retorna true, se a pilha estiver vazia, caso contrário, retorna false.
*  size(): Retorna o tamanho o número de elementos que estão na pilha.
*  clear(): Este método limpa a pilha.
*  toString():o método toString() em Java serve para converter um objeto em uma representação textual (String).

Complexidade:

* push → O(1)
* pop → O(1)

Observação: A implementação conta com um método resize() privado que dobra a capacidade do array interno sempre que o limite é atingido, garantindo que a pilha nunca transborde (dentro dos limites da JVM).

### 2.  Fila (Queue)
A Fila segue o princípio FIFO (First In, First Out), onde o primeiro elemento a entrar é o primeiro a ser removido.

#### Métodos Principais:

*  enqueue(T item): Adiciona um elemento ao final da fila.
*  dequeue(): Remove o elemento da frente da fila.
*  peek(): Retorna o primeiro elemento sem removê-lo.
*  isEmpty(): Retorna true, se a pilha estiver vazia, caso contrário, retorna false.
*  size(): Retorna o tamanho o número de elementos que estão na pilha.
*  clear(): Este método limpa a pilha.
*  toString():o método toString() em Java serve para converter um objeto em uma representação textual (String).

 #### Complexidade:

* enqueue → O(1)
* dequeue → O(n)

Observação: No método dequeue(), a implementação realiza o deslocamento (shift) de todos os elementos restantes para manter a integridade da ordem, garantindo que o próximo elemento esteja sempre no índice 0, o que torna a operação `dequeue` O(n) devido ao deslocamento de elementos.

## Detalhes de Implementação
Ambas as classes utilizam Generics (<T>), permitindo que as estruturas armazenem qualquer tipo de objeto (Integer, String, objetos customizados, etc.).

---

##  Conceitos aplicados:

* Tipos Abstratos de Dados (TAD)
* Estruturas lineares
* Alocação dinâmica de memória (arrays redimensionáveis)
* Genéricos em Java (`<T>`)
* Complexidade de algoritmos (Big-O)

---

##  Autor

**Lucas Mbunga António Pascoal**

## Licença

Este projeto é apenas para fins acadêmicos.
