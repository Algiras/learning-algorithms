package algorithms.structures;

public class QueueOfArrayBase<T> implements Queue<T> {
    private Integer maxSize, head, tail;
    private T[] items;

    QueueOfArrayBase(Integer size){
        items = (T[])new Object[size];
        head = 0;
        tail = 0;
        maxSize = size;
    }

    public void enqueue(T item) {
        if(tail.equals(maxSize) && head > 0) {
            headMove();
        }
        items[tail++] = item;
    }

    private void headMove(){
        for(Integer i = 0; i <= head; i++){
            items[i] = items[head + i];
        }
        tail = head;
        head = 0;
    }

    public T dequeue() {
        if(head.equals(tail - 1)){
            headMove();
        }
        return items[head++];
    }

    public boolean isEmpty() {
        return tail == 0;
    }
}
