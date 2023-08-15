package datastructures.src.com.scaler.advanced.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSort {

    private int V;

    private ArrayList<ArrayList<Integer>> adjList;

    public TopoSort(int vertices) {
        V = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
    }

    public static void main(String[] args) {
        int numVertices = 6;
        TopoSort graph = new TopoSort(numVertices);

        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(5, 0);
        graph.addEdge(5, 2);

        int[] ans = topoSort(numVertices, graph);
        for (int node : ans) {
            System.out.print(node + " ");
        }
        System.out.println("");
    }

    private static void dfs(int node, int vis[], Stack<Integer> st,
                            TopoSort graph){
        vis[node] = 1;
        for (int it: graph.adjList.get(node)){
            if(vis[it] == 0)
                dfs(it,vis,st,graph);
        }
        st.push(node);
    }

    private static int[] topoSort(int V, TopoSort graph) {
        int[] vis = new int[V];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0)
                dfs(i, vis, st, graph);
        }
        int[] ans = new int[V];
        int i = 0;

        while(!st.isEmpty()){
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
    }





}
