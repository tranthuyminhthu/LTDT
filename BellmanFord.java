package Bellman_Ford;

import java.util.List;

public class BellmanFord {

	private List<Edge> egdeList;
	private List<Vertex> vertexList;

	public BellmanFord(List<Edge> egdeList, List<Vertex> vertexList) {
		super();
		this.egdeList = egdeList;
		this.vertexList = vertexList;
	}

	public void bellmanFord(Vertex sourceVertex) {
		sourceVertex.setDistance(0);
		for (int i = 0; i < vertexList.size() - 1; ++i) {
			for (Edge edge : egdeList) {

				Vertex u = edge.getStarVertex();
				Vertex v = edge.getTargetVertex();

				if (u.getDistance() == Double.MAX_VALUE)
					continue;

				double newDistance = u.getDistance() + edge.getWeight();

				if (newDistance < v.getDistance()) { // cap nhat lai khoang cach
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}

			}

		}
		for (Edge edge : egdeList) { // chu trinh am
			if (edge.getStarVertex().getDistance() != Double.MAX_VALUE) {

				if (hasCycle(edge)) {
					System.out.println("Chu trinh am");
					return;
				}
			}

		}
	}

	private boolean hasCycle(Edge edge) {
		// TODO Auto-generated method stub
		return edge.getStarVertex().getDistance() +edge.getWeight() < edge.getTargetVertex().getDistance();
	}

	// Duong di ngan nhat
	public void shortedPath(Vertex targetVertex) {
		if (targetVertex.getDistance() != Integer.MAX_VALUE) {
			System.out.println("Duong di la, voi chi phi: " + targetVertex.getDistance());

			Vertex actualVertex = targetVertex;
			System.out.println(actualVertex + " - ");
			while (actualVertex.getPreviousVertex() != null) { // co duong di
				actualVertex = actualVertex.getPreviousVertex();
				System.out.println(actualVertex + " - "); // duong di ngan nhat
//				
			}
		} else {
			System.out.println("Khong co duong di den dich");
		}
	}
}
