import java.util.ArrayList;
import java.util.LinkedList;

/**
 * *********************************************************************************
 * Depth First Traversal (or Search) for a graph is similar to Depth First Traversal of a tree.
 * To avoid processing a node more than once, use a boolean visited array.
 * A graph can have more than one DFS traversal.
 * *********************************************************************************
 *
 * @author srinivas.adepu
 */
public class DFSUtil {


    /**
     * DFS - Function that returns the longest path
     * @param node node
     * @param adj adj array
     * @param dp  Dp array
     * @param visited Visited array
     */
    static void dfs(int node, ArrayList<Integer> adj[], int dp[], boolean visited[])
    {
        // Mark as visited
        visited[node] = true;

        // Traverse for all its children
        for (int i = 0; i < adj[node].size(); i++)
        {

            // If not visited
            if (!visited[adj[node].get(i)])
                dfs(adj[node].get(i), adj, dp, visited);  // recursive

            // Store the max of the paths
            dp[node] = Math.max(dp[node], 1 + dp[adj[node].get(i)]);
        }
    }

    /**
     * Function that returns the longest path
     * @param graph
     * @return longest path
     */
    static int findLongestPath( Graph graph)
    {
        int n = graph.vertices;
        ArrayList<Integer> adj[] = graph.getEdges();

        // Dp array
        int[] dp = new int[n+1];

        // Visited array to know if the node
        // has been visited previously or not
        boolean[] visited = new boolean[n + 1];

        // Call DFS for every unvisited vertex
        for (int i = 1; i <= n; i++)
        {
            if (!visited[i])
                dfs(i, adj, dp, visited);
        }

        int ans = 0;

        // Traverse and find the maximum of all dp[i]
        for (int i = 1; i <= n; i++)
        {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
