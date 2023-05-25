package edu.javagym.datastructures.tree.binary_tree;

public class Main {
    public static void main(String[] args) {
        Node<Integer> root = new Node<Integer>(null, null, 100);
        BinaryTree<Integer> binaryTree = new BinaryTree<>(root);

        Boolean wasFound = binaryTree.breadthFirstSearch(100);
        if (wasFound) {
            System.out.println("100 was found in binary tree");
        } else {
            System.out.println("100 was NOT found in binary tree");
        }
    }
}
