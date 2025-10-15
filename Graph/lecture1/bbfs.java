package Graph.lecture1;
import java.util.*;
public class bbfs {
    
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
        bfs(graph);

    }
    public static void bfs(List<List<Integer>> graph){
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[graph.size()];
        q.add(0);
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            if(!vis[node]){
                vis[node]=true;
                for(int i=0;i<graph.get(node).size();i++){
                    int nbr=graph.get(node).get(i);
                    if(!vis[nbr]){
                        q.add(nbr);
                    }
                }
            }
        }
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int nbr:graph.get(node)){
                if(!vis[nbr]){
                    q.add(nbr);
                    vis[nbr]=true;
                }
            }
        }
    }
}
