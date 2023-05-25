package edu.javagym.datastructures.adjacency_list;

import java.util.HashMap;
import java.util.Map;

import edu.javagym.datastructures.linked_list.LinkedList;
import edu.javagym.datastructures.linked_list.Node;

public class AdjacencyList {
    private Map<String, LinkedList<Edge>> graph;

    public AdjacencyList() {
        this.graph = new HashMap<>();
    }

    public void addNewVertice(String verticeLabel) {
        graph.putIfAbsent(verticeLabel, new LinkedList<>());
    }

    public void addEdge(String firstVerticeLabel, String secondVerticeLabel, Integer weight) {
        LinkedList<Edge> firstVertice = graph.get(firstVerticeLabel);
        if (firstVertice == null) {
            // TODO: add error handling
            return;
        }
        Node<Edge> node = new Node<>(new Edge(secondVerticeLabel, weight));
        firstVertice.append(node);
    }

    public LinkedList<Edge> getAllNeighbors(String verticeLabel) {
        LinkedList<Edge> neighbors = graph.get(verticeLabel);
        if (neighbors == null) {
            throw new NullPointerException("Selected vertice does not exist");
        }
        return neighbors;
    }
}
