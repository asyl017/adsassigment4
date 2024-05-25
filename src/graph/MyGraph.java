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
    public void addVertex (Vertex vertex){
        list.put(vertex,new ArrayList<>());
    }

}
