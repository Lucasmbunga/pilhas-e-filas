<<<<<<< HEAD
# pilhas-e-filas
Repositório de trabalho da cadeira de Algoritmos e Estruturas de dados sobre pilhas e filas
=======
# Estruturas de Dados - Pilha (Stack) e Fila (Queue)

Este projeto implementa os Tipos Abstratos de Dados (TAD):

* **Pilha (Stack)** → LIFO (*Last In, First Out*)
* **Fila (Queue)** → FIFO (*First In, First Out*)

As implementações foram desenvolvidas manualmente, sem uso de estruturas prontas, com foco em compreender o funcionamento interno e aplicar boas práticas de programação.

# Tecnologias Utilizadas

* Java 
* Python 
* Git & GitHub 

---

# Estrutura do Projeto

```
data-structures-tad/
│
├── java/
│   ├── Stack.java
│   ├── Queue.java
│   └── Main.java
│
├── python/
│   ├── stack.py
│   ├── queue.py
│   └── test.py
│
└── README.md
```

---

# Funcionalidades

## Pilha (Stack)

* `push(T item)` → Insere elemento no topo
* `pop()` → Remove elemento do topo
* `peek()` → Consulta o topo
* `isEmpty()` → Verifica se está vazia
* `size()` → Retorna o número de elementos
* `clear()` → Limpa a pilha

 Complexidade:

* push → O(1)
* pop → O(1)

---

## Fila (Queue)

* `enqueue(T item)` → Insere elemento no final
* `dequeue()` → Remove elemento do início
* `peek()` → Consulta o primeiro elemento
* `isEmpty()` → Verifica se está vazia
* `size()` → Retorna o número de elementos
* `clear()` → Limpa a fila

 Complexidade:

* enqueue → O(1)
* dequeue → O(n) *(na versão com array simples)*

---

# Como Executar

##  Java

cd java
javac *.java
java Main

---

## Python

cd python
python test.py

---

#  Conceitos Aplicados

* Tipos Abstratos de Dados (TAD)
* Estruturas lineares
* Alocação dinâmica de memória (arrays redimensionáveis)
* Genéricos em Java (`<T>`)
* Complexidade de algoritmos (Big-O)

---

#  Observações

* A fila foi implementada com array simples, o que torna a operação `dequeue` O(n) devido ao deslocamento de elementos.

---

#  Autor

**Lucas Mbunga António Pascoal**

# Licença

Este projeto é apenas para fins acadêmicos.
>>>>>>> 574474c (Add README for data structures project)
