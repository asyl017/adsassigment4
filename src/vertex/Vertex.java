package vertex;

import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>,Double> adjacentVertices;
}
