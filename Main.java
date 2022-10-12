import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.empty());
        stack.push("Meh");
        stack.push("Первый элемент");
        System.out.println(stack.empty());
        if(!stack.empty()) {
            System.out.println(stack.pop() + " Тут");
            System.out.println("Если бы было снова pop, то стояло бы true, стоит: " + stack.peek());
        } System.out.println(stack.empty());
    }
}