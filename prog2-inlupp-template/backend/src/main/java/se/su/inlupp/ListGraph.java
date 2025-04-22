package se.su.inlupp;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ListGraph<T> implements Graph<T> {
    private final Map<T, Set<T>> nodes = new HashMap<>();

    @Override
    public void add(T node) {
        nodes.putIfAbsent(node, new HashSet<>());
    }

    @Override
    public void remove(T node) throws NoSuchElementException {
        if (!nodes.containsKey(node)) {
            throw new NoSuchElementException("Node inte funnen i grafen");
        }

        for (T neighbor : nodes.get(node)) {
            nodes.get(neighbor).remove(node);
        }
        nodes.remove(node);
    }

    @Override
    public void connect(T node1, T node2, String name, int weight) {
        throw new UnsupportedOperationException("Unimplemented method 'connect'");
    }

    @Override
    public void setConnectionWeight(T node1, T node2, int weight) {
        throw new UnsupportedOperationException("Unimplemented method 'setConnectionWeight'");
    }

    @Override
    public Set<T> getNodes() {
        throw new UnsupportedOperationException("Unimplemented method 'getNodes'");
    }

    @Override
    public Collection<Edge<T>> getEdgesFrom(T node) {
        throw new UnsupportedOperationException("Unimplemented method 'getEdgesFrom'");
    }

    @Override
    public Edge<T> getEdgeBetween(T node1, T node2) {
        throw new UnsupportedOperationException("Unimplemented method 'getEdgeBetween'");
    }

    @Override
    public void disconnect(T node1, T node2) {
        throw new UnsupportedOperationException("Unimplemented method 'disconnect'");
    }

    @Override
    public boolean pathExists(T from, T to) {
        throw new UnsupportedOperationException("Unimplemented method 'pathExists'");
    }

    @Override
    public List<Edge<T>> getPath(T from, T to) {
        throw new UnsupportedOperationException("Unimplemented method 'getPath'");
    }
}
