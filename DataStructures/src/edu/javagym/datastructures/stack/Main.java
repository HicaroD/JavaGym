package edu.javagym.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        try {
            Integer item = stack.pop();
            assert (item == 30);
        } catch (Exception e) {
            System.out.println("Stack is empty!");
        }
        System.out.println(stack.top());
    }
}
