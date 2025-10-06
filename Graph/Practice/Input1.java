package Graph.Practice;
import java.util.*;

public class Input1 {
    // Adjacency list to store the graph
    private List<List<Integer>> adj;
    private final int V; // Number of vertices

    /**
     * Constructor to initialize the graph with a given number of vertices.
     * @param V The number of vertices in the graph.
     */
    public Input1(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    /**
     * Adds an edge between two vertices for an undirected graph.
     * @param u The source vertex.
     * @param v The destination vertex.
     */
    public void addEdge(int u, int v) {
        // Add v to u's list
        adj.get(u).add(v);
        // Add u to v's list (since the graph is undirected)
        // For a directed graph, you would remove the line below.
        adj.get(v).add(u);
    }

    /**
     * Prints the adjacency list representation of the graph.
     */
    public void printGraph() {
        System.out.println("Adjacency List Representation of the Graph:");
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            // Using a simple for-each loop to print neighbors
            for (Integer neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    /**
     * The main method to create a graph, add edges, and print it.
     */
    public static void main(String[] args) {
        // Create a graph with 5 vertices (0 to 4)
        int V = 5;
        Input1 g = new Input1(V);

        // Add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // Print the graph to see the connections
        g.printGraph();
        boolean[] visited=new boolean[V];
        g.DFS(0,visited);
        g.BFS(0);
    }
    public void DFS(int node, boolean[] visited) {
    visited[node] = true;
    System.out.print(node + " ");

    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) {
            DFS(neighbor, visited);
        }
    }
}
public void BFS(int start) {
        System.out.println("\nBFS Traversal starting from vertex " + start + ":");
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println(); // For a new line after the traversal output
    }
}