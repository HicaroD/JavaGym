package stack;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    private int getLastIndex() {
        return items.size() - 1;
    }

    public void push(T element) {
        items.add(element);
    }

    public T top() {
        int lastIndex = getLastIndex();
        return items.get(lastIndex);
    }

    public T pop() throws Exception {
        if (items.isEmpty()) {
            throw new Exception("Stack underflow error");
        }

        int lastIndex = getLastIndex();
        T removedItem = top();
        items.remove(lastIndex);

        return removedItem;
    }

    public ArrayList<T> getItems() {
        return items;
    }
}
