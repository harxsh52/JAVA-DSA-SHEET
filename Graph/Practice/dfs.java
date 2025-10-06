package Graph.Practice;

public class dfs {
    public void DFS(int node, boolean[] visited) {
    visited[node] = true;
    System.out.print(node + " ");

    for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) {
            DFS(neighbor, visited);
        }
    }
}

}
