package edu.javagym.datastructures.queue;

import edu.javagym.datastructures.linked_list.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.peek());
        arrayQueue.dequeue();
        System.err.println(arrayQueue.size());

        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue.dequeue());
    }
}
