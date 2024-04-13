package atcoder;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// This class represents a
// directed graph using adjacency
// list representation
public class E {
    private int V;

    // Array of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];

    E(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        // Add w to v's list.
        adj[v].add(w);
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal.
    // It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }

    // Driver Code
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt() - 1;

        E g = new E(n);

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            g.addEdge(scanner.nextInt(), scanner.nextInt());
        }

        System.out.println("finished graph");

        int[] c = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            c[i] = scanner.nextInt();
        }
        System.out.println("finished c");


        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        // Function call
        g.DFS(2);
    }
}

