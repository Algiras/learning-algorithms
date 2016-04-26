package algorithms.structures;

public class LinkedList<T> {

    private int length;
    private Node first = new Node();
    private Node last = new Node();

    private class Node{
        T item;
        Node next;
        Node prev;
    }

    public LinkedList(){
        length = 0;
    }

    public LinkedList<T> unShift(T item){
        Node value = new Node();
        value.item = item;
        value.next = null;
        value.prev = null;
        length++;
        if(last.item != null) {
            last.next = value;
        }
        if(length == 1){
            first = value;
        }
        last = value;
        return this;
    }

    public T shift(){
        if(length > 0) {
            T item = first();
            first = first.next;
            length--;
            return item;
        } else {
            return null;
        }
    }

    public LinkedList<T> push(T item){
        Node value = new Node();
        value.item = item;
        length++;
        if(first.item != null){
            value.next = first;
            first.prev = value;
        }
        if(length == 1){
            last = value;
        }
        first = value;
        return this;
    }

    public T pop(){
        if(length > 0) {
            T item = last();
            if (last.prev != null) {
                last = last.prev;
            }
            length--;
            return item;
        } else {
            return null;
        }
    }

    public Integer length(){
        return length;
    }

    public T first(){
        return first.item;
    }

    public T last(){
        return last.item;
    }
}
