package algorithms.structures;

import java.util.Iterator;

public interface Bag<T>{
    void addItem(T item);
    int size();
    Iterator<T> iterator();
}
