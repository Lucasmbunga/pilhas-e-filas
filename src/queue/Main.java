package queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue=new Queue<>();
        queue.enqueue("Lucas");
        queue.enqueue("Maria");
        queue.enqueue("Antonio");
        System.out.println(queue.toString());

        queue.dequeue();
        System.out.println(queue.toString());
    }
}
