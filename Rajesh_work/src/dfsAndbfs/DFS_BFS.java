package dfsAndbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
	

public class DFS_BFS
{

	public static void main(String[] args)
	{
		new DFS_BFS();
	}
	
	int N;
	boolean[][] G;
	
	
	DFS_BFS()
	{
		setGraph();		
		DFS();		
		BFS();
	}
	
	void setGraph()
	{		
		N=6;
		G=new boolean[N][N];
		
		G[0][1]=G[1][0]=true;
		G[0][4]=G[4][0]=true;
		G[1][2]=G[2][1]=true;
		G[4][3]=G[3][4]=true;
		G[2][3]=G[3][2]=true;
		G[3][5]=G[5][3]=true;
	}

	void DFS()
	{
		System.out.println("DFS algorithm..........");
		boolean[] V=new boolean[N];
		
		for (int i=0; i<N; ++i)
			if (!V[i])
			{
				DFS(i,V);
			}
	}
	
	void DFS(int at, boolean[] V)
	{
		
		V[at]=true;
		
		for (int i=0; i<N; ++i)
			if (G[at][i] && !V[i])
			{
				DFS(i,V);
			}
		
		System.out.println(at+1);
	}
	

	void BFS()
	{
		System.out.println("BFS algorithm..........");
		boolean[] V=new boolean[N];
		
		for (int i=0; i<N; ++i)
			if (!V[i])
			{
				BFS(i,V);
			}
	}

	void BFS(int start, boolean[] V)
	{
		Queue<Integer> Q=new LinkedList<Integer>(); 
		Q.offer(start);
		V[start]=true;
				
		
		while (!Q.isEmpty())
		{
			int at=Q.poll();
			
			for (int i=0; i<N; ++i)
				if (G[at][i] && !V[i])
				{
					Q.offer(i);
					V[i]=true;
				
				}
			System.out.println(at+1);
		}
	}

}