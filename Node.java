
	public class Node {
		private int data;
		private Node next;
		
		// constructors
		public Node (int item) {
			this (item, null);
		}
		
		public Node (int item, Node link) {
			data = item;
			next = link;
		}
		
		// getters and setter
		public int getData() {
			return data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setData(int item) {
			data = item;
		}
		
		public void setNext (Node link) {
			next = link;
		}
		
		public String toString() {
			return "Data = " + data;
	}
}
