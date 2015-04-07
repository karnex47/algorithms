public class LinkedListQuestion {

	public static void main(String args[]) {
		class Node {
			public int data;
			public Node next;
		}
		Node root = new Node();
		Node conductor = root;

		for (int i = 1; i<=10; i++) {
			conductor.data = i;
			conductor.next = new Node();
			conductor = conductor.next;
		}

		conductor.next = null;
		conductor = root;

		// Write your code here


		// Print the list
		conductor = root;
		while(conductor.next != null) {
			conductor = conductor.next;
		}
	}
}