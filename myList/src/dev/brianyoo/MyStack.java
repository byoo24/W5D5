package dev.brianyoo;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements MyArray<T> {

    private final List<T> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }


    // PUSH
    /**
     * Pushes an item on top of the stack
     */
    public void add(T item){
        stack.add(item);
    }

    // POP
    /**
     * Removes an item on top of the stack
     * and returns that item
     *
     * @return Returns the item that is being removed
     * from the stack
     */
    public T remove() {
        if(this.size() <= 0) {
            return null;
        }

        int lastIdx = this.size() - 1;
        return stack.remove(lastIdx);
    }

    /**
     * Returns the item on top of the stack
     *
     * @return Returns the item on top of the stack
     */
    public T peek() {
        int lastIdx = this.size();
        return stack.get(lastIdx - 1);
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in this stack
     */
    public int size() {
        return this.stack.size();
    }

    /**
     * Returns {@code true} if this stack contains no elements.
     *
     * @return {@code true} if this stack contains no elements
     */
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void print() {
        System.out.println(stack);
    }
}
