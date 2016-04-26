package algorithms.structures;

import java.util.Iterator;

public class Bagof<T> implements Bag<T>{
    private Node first = null;
    private Integer size = 0;

    private class Node{
        T item;
        Node next;
    }

    public void addItem(T item) {
        Node oldItem = first;
        first = new Node();
        first.item = item;
        first.next = oldItem;
        size++;
    }

    public int size() {
        return size;
    }

    private class BagIterator implements Iterator<T>{
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }

    public Iterator<T> iterator() {
        return new BagIterator();
    }
}
