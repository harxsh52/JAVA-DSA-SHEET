package Graph.lecture1;
import java.util.*;

public class haspathdfs {
    public static void main(String[] args) {
        List<List<Integer>> graph=new ArrayList<>();
        int V=6;
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());

        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(4);
        graph.get(2).add(0);
        graph.get(3).add(3);
        graph.get(4).add(5);
        boolean vis[]=new boolean[V];
        System.out.println("Path from 0 to 5? " + hasPath(graph, 0, 3,vis));
    }
    public static boolean hasPath(List<List<Integer>> graph,int src,int dest,boolean vis[]){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int nbr:graph.get(src)){
            if(!vis[nbr]){
                return hasPath(graph,nbr,dest,vis);
            }
        }
        return false;
    }
}
