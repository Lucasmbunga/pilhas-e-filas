import stack.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
    }
}