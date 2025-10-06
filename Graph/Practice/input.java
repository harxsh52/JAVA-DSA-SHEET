import java.util.*;

class Graph {
    private List<List<Integer>> adj;

    public Graph(int V) {
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove this for directed graph
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println(i + " -> " + adj.get(i));
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.printGraph();
    }
}
