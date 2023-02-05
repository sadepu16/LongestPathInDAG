import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class represents a directed graph
 */
public class Graph {

    int vertices;
    ArrayList<Integer> edge[];


    Graph(int vertices)
    {
        this.vertices = vertices;
        edge = new ArrayList[vertices+1];
        for (int i = 0; i <= vertices; i++)
        {
            edge[i] = new ArrayList<>();
        }
    }
    void addEdge(int a,int b)
    {
        edge[a].add(b);
      }
    ArrayList<Integer>[] getEdges(){
        return edge;
    }

}
