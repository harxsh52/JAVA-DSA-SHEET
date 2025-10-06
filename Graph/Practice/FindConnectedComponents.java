package Graph.Practice;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindConnectedComponents {

    /**
     * A helper function to perform DFS starting from a given vertex.
     * It marks all reachable vertices from 'u' as visited.
     *
     * @param u        The starting vertex for the DFS traversal.
     * @param adj      The adjacency list of the graph.
     * @param visited  A boolean array to keep track of visited vertices.
     */
    public static void dfs(int u, List<List<Integer>> adj, boolean[] visited) {
        // Mark the current vertex as visited.
        visited[u] = true;

        // Recursively visit all adjacent, unvisited vertices.
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(v, adj, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the graph input (V E, followed by E lines of edges):");

        // 1. Read the number of vertices and edges.
        int V = sc.nextInt();
        int E = sc.nextInt();

        // 2. Initialize the adjacency list.
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // 3. Read E edges and build the graph.
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Add edges for an undirected graph.
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // 4. Find and count connected components.
        boolean[] visited = new boolean[V];
        int componentCount = 0;

        for (int i = 0; i < V; i++) {
            // If a vertex has not been visited, it means we found a new component.
            if (!visited[i]) {
                // Start a DFS from this vertex to find all nodes in this component.
                dfs(i, adj, visited);
                // Increment the component counter.
                componentCount++;
            }
        }

        // 5. Print the final result.
        System.out.println("\nNumber of connected components: " + componentCount);

        sc.close();
    }
}