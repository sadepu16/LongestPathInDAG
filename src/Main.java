public class Main {

    public static void main(String[] args) {

        int vertices = 5;
        Graph graph = new Graph(vertices);
        // Example-1
        graph.addEdge( 1, 2);
        graph.addEdge( 1, 3);
        graph.addEdge( 3, 2);
        graph.addEdge( 2, 4);
        graph.addEdge( 3, 4);

        System.out.println( DFSUtil.findLongestPath( graph));
    }
}