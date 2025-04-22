package se.su.inlupp;

public class Edge<T> {
    private final T destination;
    private final String name;
    private int weight;

    public Edge(T destination, String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Vikten får inte vara negativ.");
        }
        this.destination = destination;
        this.name = name;
        this.weight = weight;
    }

    public T getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Vikten får inte vara negativ.");
        }
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Edge to " + destination + " via " + name + " (" + weight + " time units)";
    }
}
