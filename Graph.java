package graphs;

import java.util.*;

public class Graph {
    LinkedList<Integer>[] adjList;
    boolean[] visited;
    int v;
    List<Integer> parents;
    List<Integer> distance;

    Graph(){

        visited = new boolean[v];
        parents = new LinkedList<>();

    }
    Graph(int size){
        v = size;
        adjList = new LinkedList[v];
        visited = new boolean[v];
        parents = new LinkedList<>();
    }

    public void addEdge(int start, int end, boolean bidir){
        adjList[start].add(end);
        if(bidir){
            adjList[end].add(start);
        }
    }

    public void build(int[][] edges){
        v = edges.length;
        for(int[] edge: edges){
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

    }

    public void bfs(int source){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited = new boolean[v];
        visited[source] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for (int vert : adjList[node]) {
                if (!visited[vert]) {
                    visited[vert] = false;
                    q.add(vert);
                }
            }
        }
    }

    public void dfs(int source){
        visited = new boolean[v];
        visited[source] = true;
        for (int i : adjList[source]) {
            if (!visited[i]) {
                dfs(i);
            }
        }

    }
}
