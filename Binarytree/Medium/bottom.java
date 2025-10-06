package Binarytree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import org.w3c.dom.Node;

public class bottom {
    class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node n=curr.node;
            int hd=curr.hd;
            map.put(hd,n.data);
            if(n.left!=null)q.offer(new Pair(n.left,hd-1));
            if(n.right!=null)q.offer(new Pair(n.right,hd+1));
        }
        return list=new ArrayList<>(map.values());
        
    }
}
