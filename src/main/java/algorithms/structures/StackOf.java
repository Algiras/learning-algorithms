package algorithms.structures;

import java.util.Iterator;

public class StackOf<T> implements Stack<T> ,Iterable<T> {
    private Node first = null;

    private class ListIterator implements Iterator<T> {
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

    private class Node{
        T item;
        Node next;
    }

    public Iterator<T> iterator() {
        return new ListIterator();
    }

    public boolean isEmpty(){
        return  first == null;
    }

    public void push(T item){
        Node oldFrist = first;
        first = new Node();
        first.item = item;
        first.next = oldFrist;
    }

    public T pop(){
        T item = first.item;
        first = first.next;
        return item;
    }
}
