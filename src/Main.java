import edge.Edge;
import graph.WeightedGraph;

public class Main {
    public static void main(String[] args) {
        /* Vertex<Integer> vertex = new Vertex<>(10);
        Vertex<Integer> vertex1 = new Vertex<>(15);
        Vertex<Integer> vertex2= new Vertex<>(20);
        Vertex<Integer> vertex3= new Vertex<>(20);
        Vertex<Integer> vertex4= new Vertex<>(20);
        Vertex<Integer> vertex5= new Vertex<>(20);

        vertex1.addAdjVertices(vertex,4);
        vertex2.addAdjVertices(vertex1,3);
        vertex.addAdjVertices(vertex2,5);
        vertex3.addAdjVertices(vertex4,1);
        vertex4.addAdjVertices(vertex5,13);
        vertex5.addAdjVertices(vertex1,22);


        vertex.printVertex();
        vertex1.printVertex();
        vertex2.printVertex();
        System.out.println(vertex1.getData());
        */
        WeightedGraph<Integer> weightedGraph = new WeightedGraph<>();
        weightedGraph.addVertex(10);
        weightedGraph.addVertex(15);
        weightedGraph.addVertex(13);
        weightedGraph.addVertex(11);
        weightedGraph.addEdge(10, 11, 56);
        weightedGraph.addEdge(11, 13, 112);
        weightedGraph.addEdge(13, 15, 112);
        weightedGraph.printWeightedGraph();
        System.out.println(weightedGraph.hasEdge(10, 15, 112));//result is false

        System.out.println(weightedGraph.getEdge(10));//result:[Edge{source=10, destination=11, weight=56.0}]

    }
}
