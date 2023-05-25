package edu.javagym.datastructures.adjacency_list;

public class Edge {
    private String label;
    private Integer weight;

    public Edge(String label, Integer weight) {
        this.label = label;
        this.weight = weight;
    }

    public String getLabel() {
        return label;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
