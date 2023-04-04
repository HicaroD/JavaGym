package edu.javagym.datastructures.queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        queue.dequeue();
        System.err.println(queue.size());
    }
}
