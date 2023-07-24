package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphUsingArrayOfLL {
    private int V; // Number of vertices
    private ArrayList<LinkedList<Integer>> adjList; // Adjacency list to represent the graph

    public GraphUsingArrayOfLL(int vertices) {
        V = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // For undirected graph
    }

    // Function to print the adjacency list
    public void printAdjacencyList() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numVertices = 5;
        GraphUsingArrayOfLL graph = new GraphUsingArrayOfLL(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printAdjacencyList();
    }
}
