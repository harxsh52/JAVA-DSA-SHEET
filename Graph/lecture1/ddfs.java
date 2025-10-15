package Graph.lecture1;
import java.util.*;
public class ddfs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(4);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(4).add(5);
        boolean vis[]=new boolean[V];
        dfs(graph,0,vis);
    }
    public static void dfs(List<List<Integer>> graph,int node,boolean vis[]){
        System.out.print(node+" ");
        vis[node]=true;
        for(int i:graph.get(node)){
            if(!vis[i]){
                dfs(graph,i,vis);
            }
        }
    }
}
