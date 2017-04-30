import edu.cmich.CPS340.MyGraph.*;
import java.util.Queue;
import java.util.LinkedList;


/**
 * 
 * @author 
 * 
 */
public class BFSTreeChecker {
	
	/**
	 * Perform a BFS traversal of a graph.  If a some point, a neighbor of a vertex
	 * being processed is found to have already been processed, then a cycle exists 
	 * and the graph does not represent a tree.
	 * 
	 * @param g Initialized graph data structure
	 * @return A boolean value indicating if g is a tree
	 */
	public static boolean isGraphATree(Graph g) {
	
		boolean isTree = true;
		Integer[] parents = new Integer[g.size]; 
		for(int i = 0; i < g.size; i++) {
			parents[i] = -1;
		}
		
		// TODO: Consider modifying the bfs algorithm to count the number of crossedges.
		//  A crossedge with occur when a node is discovered a second time but it has 
		//  already been discovered (i.e., numbered).  If a cross edge exists then 
		/   the graph can't be a tree.  


		
		return isTree;
	}

	
	/**
	 * Performs a BFS starting at a given node.  
	 * @param g Initialized graph data structure
	 * @param startVertex Index for starting point of traversal. 
	 * @param parents An array indicating the vertex that discovered the ith vertex 
	 * @return the number of cross edges found.
	 * 
	 */
	public static int bfs(Graph g, int startVertex, Integer[] parents) {
		Queue<Integer> q = new LinkedList<Integer>();
		int currNode = 0;
		Integer[] adjVector = null;
		int crossEdgeCount = 0;

		// Count the number of cross edges.  Be careful not to count the parent node as 
		//  a cross edge.


		return crossEdgeCount;

	}
	

	
	
	
	
}