package asd;

public class Main
{

   public static void main(String[] args)
   {
//                         1  2  3  4  5  6 
      int[][] nodes = {  { 0, 0, 1, 0, 0, 1, 0 },  // 1
    		  			 { 0, 1, 0, 1, 0, 0, 0 },  // 2
    		  			 { 0, 0, 1, 0, 1, 0, 0 },  // 3
    		  			 { 0, 0, 0, 1, 0, 1, 1 },  // 4
    		  			 { 0, 1, 0, 0, 1, 0, 0 },  // 5
    		  			 { 0, 0, 0, 0, 1, 0, 0 }}; // 6


      BFS bfs = new BFS(nodes);
      DFS dfs = new DFS(nodes);
      
      System.out.println("Using BFS algorithm..........");
      bfs.bfs();
      
      System.out.println("Using DFS algorithm..........");
      dfs.clearVisited();
      dfs.dfs();

   }
}