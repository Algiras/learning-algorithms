package algorithms.structures;

import java.util.Iterator;
import java.util.function.Consumer;

public class StackOfArrayBase<T> implements Stack<T>, Iterable<T>{

    private T[] items;
    private Integer index = 0;

    public StackOfArrayBase(int size){
        items = (T[])new Object[size];
    }

    public StackOfArrayBase(){
        items = (T[])new Object[1];
    }

    public void push(T item) {
        if(items.length == index){
            resize(2 * items.length);
        }
        items[index++] = item;
    }

    private void resize(Integer capacity){
        T[] doubled = (T[])new Object[capacity];
        System.arraycopy(items, 0, doubled, 0, index);
        items = doubled;
    }

    public T pop() {
        T item = items[--index];
        items[index] = null;
        if(index > 0 && index == items.length / 4){
            resize(items.length / 2);
        }
        return item;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    private class ReverseArrayIterator implements Iterator<T>{
        Integer iterIndex = index;

        public boolean hasNext() {
            return iterIndex > 0;
        }

        public T next() {
            return items[--iterIndex];
        }
    }

    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }
}
