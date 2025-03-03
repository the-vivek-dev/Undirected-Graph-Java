/*
 * author: Vivek Kumar
 * program_name: Creating Undirected Graph
 */
import java.util.ArrayList;

final public class Graph {
    private ArrayList<ArrayList<Integer>> graphs;
    private int vertices;

    Graph(int vertices) {
        this.vertices = vertices;
        graphs = new ArrayList<>();
        // Initialize the graph
        for (int i = 0; i < vertices; i++) {
            graphs.add(new ArrayList<>());
        }
    }

    // Create the undirected graph
    void createGraph(int source, int des) {
        graphs.get(source).add(des);
        graphs.get(des).add(source); 
    }

    // Function to print the graph
    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");  
            ArrayList<Integer> list = graphs.get(i);
            for (int j = 0; j < list.size(); j++) {
                int neighbor = list.get(j); 
                System.out.print(neighbor + " "); 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);

        graph.createGraph(0, 1);
        graph.createGraph(0, 5);
        graph.createGraph(1, 2);
        graph.createGraph(1, 3);
        graph.createGraph(2, 3);
        graph.createGraph(3, 4);
        graph.createGraph(4, 5);
        graph.createGraph(3, 5);

        graph.printGraph(); 
    }
}
