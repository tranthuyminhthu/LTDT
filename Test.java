package Bellman_Ford;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List <Vertex> vertexList= new ArrayList<>();
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
	
		
		List<Edge> edgeList = new ArrayList<>();
		edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(1)));
		edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(2)));
		edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(2)));
	
		BellmanFord bellman = new BellmanFord(edgeList, vertexList);
		bellman.shortedPath(vertexList.get(0));
		bellman.shortedPath(vertexList.get(2));
	}
	

}
