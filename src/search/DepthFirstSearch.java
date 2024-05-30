package search;

import graph.MyGraph;

public class DepthFirstSearch<Vertex> extends Search<Vertex> {
    public DepthFirstSearch(Vertex source, MyGraph<Vertex> graph) {
        super(source);
        depthFirstSearch(source, graph);
    }

    private void depthFirstSearch(Vertex current, MyGraph<Vertex> graph) {
        marked.add(current);
        for (Vertex vertex : graph.adjacencyList(current)) {
            if (!marked.contains(vertex)) {
                edgeTo.put(vertex, current);
                depthFirstSearch(vertex, graph);
            }
        }
    }
}