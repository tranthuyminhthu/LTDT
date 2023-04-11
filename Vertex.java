package Bellman_Ford;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private double distance = Double.MAX_VALUE;
	private Vertex previousVertex;
	private List<Edge> adjacencies;

	Vertex(String name) {

		this.name = name;
		this.adjacencies = new ArrayList<>();

	}

	public void addNeighbour(Edge edge) {
		this.adjacencies.add(edge);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(List<Edge> adjacencies) {
		this.adjacencies = adjacencies;
	}
public String toString() {
	return this.name;
}
	
	

}
