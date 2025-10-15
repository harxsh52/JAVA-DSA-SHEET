package Graph.lecture1;
import java.util.*;
public class haspathbfs {
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
        graph.get(2).add(3);
        graph.get(4).add(5);
        int src1 = 0;
        int dest1 = 5;
        System.out.println("Path from " + src1 + " to " + dest1 + "? " + hasPath(graph, src1, dest1));

        // Test 2: Path from 3 to 5 (should be false)
        int src2 = 3;
        int dest2 = 5;
        System.out.println("Path from " + src2 + " to " + dest2 + "? " + hasPath(graph, src2, dest2));
        boolean t=hasPath(graph,0,6);
        System.out.println(t);
    }
    public static boolean hasPath(List<List<Integer>> graph,int src,int dest){
        if(src==dest){
            return true;
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        boolean vis[]=new boolean[graph.size()];
        while(!q.isEmpty()){
            int node=q.poll();
            if(!vis[node]){
                vis[node]=true;
                for(int nbr:graph.get(node)){
                    if(nbr==dest){
                        return true;
                    }
                    if(!vis[nbr]){
                        q.add(nbr);
                    }
                }
            }
        }
                return false;
    }
}
