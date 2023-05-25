package edu.javagym.datastructures.tree.binary_tree;

import edu.javagym.datastructures.queue.LinkedListQueue;

public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public Boolean breadthFirstSearch(T target) {
        LinkedListQueue<Node<T>> queue = new LinkedListQueue<>();
        queue.enqueue(root);

        while (queue.size() > 0) {
            System.out.println("Goes here");
            Node<T> currentNode = queue.dequeue();

            if (currentNode.data.equals(target)) {
                return true;
            }
            if (currentNode.left != null) {
                queue.enqueue(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.enqueue(currentNode.right);
            }
        }
        return false;
    }
}
