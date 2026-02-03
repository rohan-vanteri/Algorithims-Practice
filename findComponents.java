package graphs;

public class findComponents {

    public int findComponents(int v, int[][] edges){
        Graph graph = new Graph(v);
        for(int[] edge: edges){
            graph.addEdge(edge[0],edge[1],false);
        }

        int components = 0;

        for (int n : graph.adjList[v]) {
            if (!graph.visited[n]) {
                components++;
                graph.bfs(n);
            }
        }

        return components;

    }
}
