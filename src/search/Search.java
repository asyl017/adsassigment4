package search;

import java.util.*;

public class Search<Vertex> {
    protected Set<Vertex> marked;
    protected Map<Vertex, Vertex> edgeTo;
    protected final Vertex source;

    public Search(Vertex source) {
        this.source = source;
        marked = new HashSet<>();
        edgeTo = new HashMap<>();
    }

    public Iterable<Vertex> pathTo(Vertex v) {
        if (!hasPathTo(v)) return null;

        LinkedList<Vertex> ls = new LinkedList<>();
        for (Vertex i = v; i != source; i = edgeTo.get(i)) {
            ls.push(i); // inverted adding
        }

        ls.push(source);

        return ls;
    }

    public boolean hasPathTo(Vertex vertex) {
        return marked.contains(vertex);
    }


}
