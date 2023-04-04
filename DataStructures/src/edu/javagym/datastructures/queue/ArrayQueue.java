package edu.javagym.datastructures.queue;

import java.util.ArrayList;

public class ArrayQueue<T> {
    private ArrayList<T> items;

    public ArrayQueue() {
        this.items = new ArrayList<>();
    }

    public void enqueue(T item) {
        items.add(item);
    }

    // NOTICE: This operations cost O(n) in the worst, therefore an ArrayQueue is
    // not the most
    // efficient way of implementing a Queue.
    public T dequeue() throws IndexOutOfBoundsException {
        T removedElement = items.remove(0);
        return removedElement;
    }

    public T peek() throws IndexOutOfBoundsException {
        return items.get(0);
    }

    public Integer size() {
        return items.size();
    }
}
