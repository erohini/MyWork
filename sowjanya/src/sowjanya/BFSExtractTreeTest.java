import static org.junit.Assert.*;

import org.junit.Test;
import edu.cmich.CPS340.MyGraph.*;

public class BFSExtractTreeTest {

	@Test 
	public void ExtractTreeWBFSTest1() {
		MyGraph g = new MyGraph(5, "1-2, 2-3, 3-4, 4-0");
		Integer[] parents = null;
		
		parents = BFSExtractTree.ExtractTreeWBFS(g);
		 
        assertEquals(parents[0].intValue(), 0);
        assertEquals(parents[1].intValue(), 2);
        assertEquals(parents[2].intValue(), 3);
        assertEquals(parents[3].intValue(), 4);
        assertEquals(parents[4].intValue(), 0);
	}
	
	@Test 
	public void ExtractTreeWBFSTest2() {
		MyGraph g = new MyGraph(9, "0-1,0-2,1-3,1-4,2-3,2-4,3-8,5-6,6-7");

		Integer[] parents = null;
		
		parents = BFSExtractTree.ExtractTreeWBFS(g);
		 
        assertEquals(parents[0].intValue(), 0);
        assertEquals(parents[1].intValue(), 0);
        assertEquals(parents[2].intValue(), 0);
        assertEquals(parents[3].intValue(), 1);
        assertEquals(parents[4].intValue(), 1);
        assertEquals(parents[5].intValue(), 5);
        assertEquals(parents[6].intValue(), 5);
        assertEquals(parents[7].intValue(), 6);
        assertEquals(parents[8].intValue(), 3);


		
	}

	@Test 
	public void ExtractTreeWBFSTest3() {
		MyGraph g = new MyGraph(9, "0-5,0-7,5-8,5-6,8-3,8-4,7-1,7-2");
 
		Integer[] parents = null;
		
		parents = BFSExtractTree.ExtractTreeWBFS(g);
		 
        assertEquals(parents[0].intValue(), 0);
        assertEquals(parents[1].intValue(), 7);
        assertEquals(parents[2].intValue(), 7);
        assertEquals(parents[3].intValue(), 8);
        assertEquals(parents[4].intValue(), 8);
        assertEquals(parents[5].intValue(), 0);
        assertEquals(parents[6].intValue(), 5);
        assertEquals(parents[7].intValue(), 0);
        assertEquals(parents[8].intValue(), 5);

		
			
	}

}