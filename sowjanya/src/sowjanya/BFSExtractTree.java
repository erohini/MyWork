import edu.cmich.CPS340.MyGraph.*;
import java.util.Queue;
import java.util.LinkedList;

/**
 * 
 * @author 
 * 
 */
public class BFSExtractTree {
	
	/**
	 * Perform a BFS traversal of a graph, keeping track of the node from which a 
	 * vertex is discovered for the first time.  This vertex will be called the parent
	 * of the node that we are discovering.  The parent of a vertex should be noted
	 * in an array in which the value for the ith element in the array is the index
	 * of that nodes parents.  Taken together, the parents array will contain the 
	 * necessary information to extract a tree from the graph.  
	 * 
	 * @param g Initialized graph data structure
	 * @return Array in which the ith element contains discovering node.
	 */
	public static Integer[] ExtractTreeWBFS(Graph g) {
	
		Integer[] parents = new Integer[g.size]; 
		for(int i = 0; i < g.size; i++) {
			parents[i] = -1;
		}
		
		// TODO: Consider running a modified bfs that instead of numbering the
 		//  vertices in the order in which they are discovered, numbers the
		//  the vertices with the "parent" (i.e., the node from which a vertex
	        //  was first discovered.


		
		return parents;
	}

	
	/**
	 * Performs a BFS starting at a given node, number the vertices by its parent.  A root node
         *  should be number with itself.  
	 * @param g Initialized graph data structure
	 * @param startVertex Index for starting point of traversal. 
	 * @param parents Parent node of each vertex of -1 if a vertex has yet to be processed.
	 * 
	 */
	public static void bfs(Graph g, int startVertex, Integer[] parents) {



		
	}
	

	
	
	
	
}