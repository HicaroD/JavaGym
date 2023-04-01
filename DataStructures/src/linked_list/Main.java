package linked_list;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.append(new Node<Integer>(10));
		list.append(new Node<Integer>(20));
		list.append(new Node<Integer>(30));
		list.append(new Node<Integer>(40));
		list.preppend(new Node<Integer>(5));
		list.remove(5);
		list.remove(40);
		list.printLinkedList();
	}
}
