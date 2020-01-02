package dev.brianyoo;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T extends Comparable<T>> implements MyArray<T> {

    private final List<T> queue;

    public MyQueue() {
        this.queue = new ArrayList<>();
    }

    // ENQUEUE
    /**
     * Pushes an item at the end of the queue
     */
    @Override
    public void add(T item) {
        queue.add(item);
    }


    // DEQUEUE
    /**
     * Removes an item at the front of the
     * queue and returns that item
     *
     * @return Returns the item that is being
     * removed from the queue
     */
    @Override
    public T remove() {
        if(this.size() <= 0) {
            return null;
        }

        return queue.remove(0);
    }

    /**
     * Returns the item at the front of the queue
     *
     * @return Returns the item at the front of the queue
     */
    @Override
    public T peek() {
        return queue.get(0);
    }

    /**
     * Returns the number of elements in this queue.
     *
     * @return the number of elements in this queue
     */
    @Override
    public int size() {
        return this.queue.size();
    }

    /**
     * Returns {@code true} if this queue contains no elements.
     *
     * @return {@code true} if this queue contains no elements
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }


    public void print() {
        System.out.println(queue);
    }
}
