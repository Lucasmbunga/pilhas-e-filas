import queue.Queue;
import stack.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Testes da estrutura de Pilha

        Stack<String> stack=new Stack<>();
        stack.push("Lucas");
        stack.push("Maria");
        stack.push("Antonio");

        System.out.println("Peek: "+stack.peek());
        System.out.println("Size: "+stack.size());
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("Peek: "+stack.peek());
        System.out.println("Size: "+stack.size());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("Peek: "+stack.peek());
        System.out.println("Size: "+stack.size());

        //Testes da estrutura de Fila

        Queue<String> queue=new Queue<>();
        queue.enqueue("Lucas");
        queue.enqueue("Maria");
        queue.enqueue("Antonio");

        System.out.println("-------------------------FILA--------------------------");
        System.out.println(queue.toString());

        queue.dequeue();
        System.out.println(queue.toString());

    }
}