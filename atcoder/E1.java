package atcoder;

import java.util.Iterator;
import java.util.LinkedList;

public class E1 {
    private int V;
    private LinkedList<Integer> adj[];

    E1(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    int bfs(int start, int end) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[start] = true;
        queue.add(start);

        int steps = 0;
        while (queue.size() != 0) {
            start = queue.poll();

            Iterator<Integer> i = adj[start].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (n == end)
                    return steps + 1;
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
            steps++;
        }
        return -1; // If end vertex is not reachable from start vertex
    }

    public static void main(String args[]) {
        E1 g = new E1(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        int start = 1, end = 2;
        int steps = g.bfs(start, end);
        if (steps != -1)
            System.out.println("Number of steps from vertex " + start + " to vertex " + end + " is " + steps);
        else
            System.out.println("Vertex " + end + " is not reachable from vertex " + start);
    }
}
