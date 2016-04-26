package algorithms.structures;

public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
}
