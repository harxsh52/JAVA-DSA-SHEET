package Graph.Practice;

import java.util.*;

public class bfs {
    private final List<List<Integer>> adj;
    private final int V; // Number of vertices
    public bfs(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    /**
     * Prints the adjacency list representation of the graph.
     */
    public void printGraph() {
        System.out.println("Adjacency List Representation of the Graph:");
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    /**
     * Performs Breadth-First Search traversal from a given starting vertex.
     * @param start The starting vertex for the BFS traversal.
     */
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
    public static void main(String[] args) {
        // Create a graph with 5 vertices (0 to 4)
        int V = 5;
        bfs g = new bfs(V);

        // Add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);

        // Print the graph to see the connections
        g.printGraph();

        // Perform BFS starting from vertex 0
        g.BFS(0);
    }
}