package Graph.1lecture;
import java.util.*;
public class graph1 {
    class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        ArrayList<Edge>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
    }
}
