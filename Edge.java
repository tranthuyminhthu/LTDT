package Bellman_Ford;

public class Edge {
	private double weight;
	private Vertex starVertex;
	private Vertex targetVertex;
	public Edge(double weight, Vertex starVertex, Vertex targetVertex) {
		super();
		this.weight = weight;
		this.starVertex = starVertex;
		this.targetVertex = targetVertex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Vertex getStarVertex() {
		return starVertex;
	}
	public void setStarVertex(Vertex starVertex) {
		this.starVertex = starVertex;
	}
	public Vertex getTargetVertex() {
		return targetVertex;
	}
	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}
	
	
	

}
