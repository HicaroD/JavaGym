package edu.javagym.datastructures.adjacency_list;

import edu.javagym.datastructures.linked_list.LinkedList;

public class Main {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();
        graph.addNewVertice("A");
        graph.addNewVertice("B");
        graph.addNewVertice("C");
        graph.addEdge("A", "B", 10);
        graph.addEdge("A", "C", 30);
        LinkedList<Edge> neighbors = graph.getAllNeighbors("A");
        neighbors.printLinkedList();
    }
}
