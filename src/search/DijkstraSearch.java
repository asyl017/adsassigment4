package search;

import edge.Edge;
import graph.WeightedGraph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DijkstraSearch<Vertex> extends Search<Vertex> {
    private final Set<Vertex> emptyNodes;
    private final Map<Vertex, Double> distances;
    private final WeightedGraph<Vertex> graph;

    public DijkstraSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);
        emptyNodes = new HashSet<>();
        distances = new HashMap<>();
        this.graph = graph;
        dijkstra();
    }

    public void dijkstra() {
        distances.put(source, 0D);
        emptyNodes.add(source);
        while (!emptyNodes.isEmpty()) {
            Vertex currentNode = getVertexWithMinWeight(emptyNodes);
            marked.add(currentNode);
            emptyNodes.remove(currentNode);
            for (Vertex neighbor : graph.adjacencyList(currentNode)) {
                double newDistance = getTheShortestDistance(currentNode) + getTheDistance(currentNode, neighbor);
                if (getTheShortestDistance(neighbor) > newDistance) {
                    distances.put(neighbor, newDistance);
                    edgeTo.put(neighbor, currentNode);
                    emptyNodes.add(neighbor);
                }
            }
        }
    }

    private double getTheDistance(Vertex node, Vertex target) {
        for (Edge<Vertex> edge : graph.getEdge(node)) {
            if (edge.getDestination().equals(target))
                return edge.getWeight();
        }
        throw new RuntimeException("Not found!");
    }

    private Vertex getVertexWithMinWeight(Set<Vertex> vertices) {
        Vertex minimum = null;
        for (Vertex vertex : vertices) {
            if (minimum == null) {
                minimum = vertex;
                continue;
            }
            if (getTheShortestDistance(vertex) < getTheShortestDistance(minimum))
                minimum = vertex;
        }
        return minimum;
    }

    private double getTheShortestDistance(Vertex destination) {
        Double d = distances.get(destination);
        return (d == null ? Double.MAX_VALUE : d);
    }
}

