package edu.javagym.datastructures.queue;

import edu.javagym.datastructures.linked_list.LinkedList;
import edu.javagym.datastructures.linked_list.Node;

public class LinkedListQueue<T> {
    private LinkedList<T> items;

    public LinkedListQueue() {
        this.items = new LinkedList<>();
    }

    public void enqueue(T item) {
        Node<T> node = new Node<>(item);
        items.append(node);
    }

    public T dequeue() {
        // TODO: deal with null problems
        T removedItem = items.removeHead().getData();
        return removedItem;
    }

    public T peek() {
        // TODO: deal with null problems
        return items.getHead().getData();
    }

    public Integer size() {
        return items.getSize();
    }
}
