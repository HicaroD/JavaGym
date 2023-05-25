package edu.javagym.datastructures.tree.binary_tree;

public class Node<T> {
    Node<T> left;
    Node<T> right;
    T data;

    public Node(Node<T> left, Node<T> right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}
