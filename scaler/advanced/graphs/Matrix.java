package datastructures.src.com.scaler.advanced.graphs;

public class Matrix {

        private int V; // Number of vertices
        private int[][] adjMatrix; // Adjacency matrix to represent the graph

        public Matrix(int vertices) {
            V = vertices;
            adjMatrix = new int[V][V];
        }

        // Function to add an edge to the graph
        public void addEdge(int source, int destination) {
            adjMatrix[source][destination] = 1;
            // If the graph is undirected, add the following line as well
            // adjMatrix[destination][source] = 1;
        }

        // Function to print the adjacency matrix
        public void printAdjacencyMatrix() {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int numVertices = 5;
            Matrix graph = new Matrix(numVertices);

            graph.addEdge(0, 1);
            graph.addEdge(0, 4);
            graph.addEdge(1, 2);
            graph.addEdge(1, 3);
            graph.addEdge(1, 4);
            graph.addEdge(2, 3);
            graph.addEdge(3, 4);

            graph.printAdjacencyMatrix();
        }
    }


