package graphs;

import java.util.LinkedList;

import java.util.Queue;

public class bipartiteGraph {

    public boolean isBipartite(int[][] edges) {
        Graph graph = new Graph();
        graph.v = edges.length;
        graph.build(edges);
        for (int n : graph.adjList[graph.v]) {
            if (!graph.visited[n]) {
                if (!bfs(n, graph)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean bfs(int source, Graph graph) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        graph.distance.set(source, 0);
        graph.visited = new boolean[graph.v];
        graph.visited[source] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int vert : graph.adjList[node]) {
                if (!graph.visited[vert]) {
                    graph.visited[vert] = false;
                    graph.parents.set(vert, node);
                    graph.distance.set(vert, graph.distance.get(node) + 1);
                    q.add(vert);
                } else {
                    if (vert != graph.parents.get(node)) {
                        if (graph.distance.get(vert).equals(graph.distance.get(node))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
