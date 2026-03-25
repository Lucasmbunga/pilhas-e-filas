from stack import Stack
from queue import Queue

print("===== TESTE STACK =====")
stack = Stack()

print("Vazia?", stack.is_empty())

stack.push(10)
stack.push(20)
stack.push(30)

print("Stack:", stack)
print("Topo:", stack.peek())

print("Removido:", stack.pop())
print("Após pop:", stack)

print("Tamanho:", stack.size())


print("\n===== TESTE QUEUE =====")
queue = Queue()

print("Vazia?", queue.is_empty())

queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)

print("Queue:", queue)
print("Primeiro:", queue.peek())

print("Removido:", queue.dequeue())
print("Após dequeue:", queue)

print("Tamanho:", queue.size())