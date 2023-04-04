package edu.javagym.datastructures.linked_list;

public class LinkedList<T> {
	private Node<T> head;
	private int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void printLinkedList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public void append(Node<T> node) {
		if (node == null) {
			throw new NullPointerException("Node para adicionar não pode ser nula");
		}

		if (head == null) {
			setHead(node);
			return;
		}

		Node<T> temp = head;
		while (temp.nextIsNotNull()) {
			temp = temp.getNext();
		}
		temp.setNext(node);
		size++;
	}

	public void preppend(Node<T> node) {
		if (node == null) {
			throw new NullPointerException("Node não pode ser nula");
		}
		node.setNext(head);
		setHead(node);
		size++;
	}

	public void removeHead() {
		Node<T> nextHeadNode = head.getNext();
		head.setNext(nextHeadNode);
		setHead(nextHeadNode);
		size--;
	}

	public void remove(T dataToBeRemoved) {
		Node<T> temp = head;

		if (temp.getData().equals(dataToBeRemoved)) {
			removeHead();
		}

		while (temp.nextIsNotNull()) {
			T nextNodeData = temp.getNext().getData();
			if (nextNodeData.equals(dataToBeRemoved)) {
				temp.setNext(temp.getNext().getNext());
				size--;
				return;
			}
			temp = temp.getNext();
		}
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}
}
