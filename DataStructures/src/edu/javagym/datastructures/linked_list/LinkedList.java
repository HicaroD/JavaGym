package edu.javagym.datastructures.linked_list;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
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
			setTail(node);
			return;
		}
		tail.setNext(node);
		setTail(node);
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

	public Node<T> removeHead() {
		Node<T> oldHead = head;
		Node<T> nextHeadNode = head.getNext();
		head.setNext(nextHeadNode);
		setHead(nextHeadNode);
		size--;
		return oldHead;
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

	public Integer indexOf(Node<T> targetNode) {
		Node<T> temp = head;
		Integer index = 0;

		while (temp.nextIsNotNull()) {
			if (temp.equals(targetNode)) {
				return index;
			}
			index++;
			temp = temp.getNext();
		}
		return -1;
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

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
}
