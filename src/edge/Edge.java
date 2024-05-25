package edge;

public class Edge<Vertex> {
    private Vertex source;
    private Vertex destination;
    private Double weight;

    public Edge(Vertex source, Vertex destination, Double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

}
