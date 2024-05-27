package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph<Vertex> {
    private Map<Vertex, List<Vertex>> list;

    public MyGraph() {
        list = new HashMap<Vertex, List<Vertex>>();
    }

    public void addVertex(Vertex vertex) {
        list.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex source, Vertex destination) {
        checkVertex(destination);
        checkVertex(source);
        list.get(source).add(destination);
        list.get(destination).add(source);
    }

    public boolean hasEdge(Vertex source, Vertex destination) {
        checkVertex(destination);
        checkVertex(source);
        List<Vertex> neighbors = getNeighbours(source);
        return neighbors != null && neighbors.contains(destination);
    }

    public void checkVertex(Vertex vertex) {
        if (!list.containsKey(vertex)) {
            throw new IndexOutOfBoundsException("Vertex" + vertex + "does not exist");
        }
    }

    public void removeEdge(Vertex source, Vertex destination) {
        checkVertex(destination);
        checkVertex(source);
        list.get(source).remove(destination);
        list.get(destination).remove(source);
    }

    public List<Vertex> getNeighbours(Vertex vertex) {
        List<Vertex> neighbour = list.get(vertex);
        return neighbour;

    }

    public void printGraph() {
        for (Vertex vertex : list.keySet()) {
            System.out.print("Vertex " + vertex + " is connected to vertices" + getNeighbours(vertex));
        }
    }

}
