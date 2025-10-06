package Binarytree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import org.w3c.dom.Node;

public class topview {
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node C=curr.node;
            int hd=curr.hd;
            if(!map.containsKey(hd)){
                map.put(hd,C.data);
            }
            if(C.left!=null)q.offer(new Pair(C.left,hd-1));
            if(C.right!=null)q.offer(new Pair(C.right,hd+1));
        }
        list=new ArrayList<>(map.values());
        return  list;
    }
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

}
