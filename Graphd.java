//DFS
import java.io.*;
import java.util.*;

class Graphd{
	private int V;
	private LinkedList<Integer>adj[];
	
	public Graphd(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0; i<v;i++){
		adj[i]=new LinkedList();	
		}
				
	}
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	void DFSutil(int vertex,boolean nodes[])
	{
		nodes[vertex]=true;
		System.out.println(vertex+" ");
		int a=0;
		
		for(int i=0;i<adj[vertex].size();i++)
		{
			a=adj[vertex].get(i);
			if(!nodes[a]){
				DFSutil(a,nodes);
			}
		}
	}
	void DFS(int v)
	{
		boolean already[]=new boolean[V];
		DFSutil(v,already);
	}	
	
	public static void main(String args[])
	{
		Graphd g =new Graphd(7);
		
		g.addEdge(0,6);
		g.addEdge(6,0);
		g.addEdge(0,5);
		g.addEdge(5,0);	
		g.addEdge(5,4);
		g.addEdge(4,5);	
		g.addEdge(0,1);
		g.addEdge(1,0);	
		g.addEdge(3,4);
		g.addEdge(4,3);	
		g.addEdge(1,2);
		g.addEdge(2,1);
		g.addEdge(6,5);
		g.addEdge(5,6);
		g.addEdge(5,0);	
		g.addEdge(0,5);	
		g.addEdge(5,2);
		g.addEdge(2,5);		
		g.addEdge(2,3);
		g.addEdge(3,2);	
		
		
		
		System.out.println("The DFS traversal of the graph is as follows:");
		g.DFS(0);
	}	
	
}
