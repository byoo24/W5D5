package dev.brianyoo;

import java.util.ArrayList;
import java.util.List;

public class MyMaxHeap<T extends Comparable<T>> implements MyArray<T> {

    private final List<T> heap;

    public MyMaxHeap() {
        this.heap = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        heap.add(item);

        if(this.size() == 1) {
            return;
        }
        siftUp(this.size() - 1);
    }

    @Override
    public T remove() {

        if (this.size() == 1){
            return heap.remove(0);
        }

        // swap max value with last item
        // then remove the last item
        int lastIdx = this.size() - 1;
        swapValues(0, lastIdx);
        heap.remove(lastIdx);

        siftDown(0);
        return null;
    }

    @Override
    public T peek() {
        return heap.get(0);
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    private int getParentIndex(int idx) {
        if (idx % 2 == 0) {
            return idx / 2 - 1;
        } else {
            return idx / 2;
        }
    }

    private void swapValues(int currIdx, int swapIdx){
        T currValue = heap.get(currIdx);
        T swapValue = heap.get(swapIdx);
        heap.set(currIdx, swapValue);
        heap.set(swapIdx, currValue);

    }


    private void siftUp(int idx) {

        // Base case
        if (idx == 0) return;

        int parentIdx = getParentIndex(idx);

        // if current > parent => 1 (or positive num)
        // if current < parent => -1 (or negative num)
        // if current == parent => 0
        if (heap.get(idx).compareTo(heap.get(parentIdx)) > 0) {
            this.swapValues(idx, parentIdx);
            this.siftUp(parentIdx);
        }

        return;
    }

    private void siftDown(int idx) {
        siftDown(idx, this.size());
    }


    private void siftDown(int idx, int heapSize) {
        // Base case
        // if index is at the end of the heap
        // then exit function
        if (idx >= heapSize - 1) {
            return;
        }

        int leftIdx = idx * 2 + 1;
        int rightIdx = idx * 2 + 2;

        T currValue = heap.get(idx);
        T leftValue = leftIdx >= heapSize ? null : heap.get(leftIdx);
        T rightValue = rightIdx >= heapSize ? null : heap.get(rightIdx);


        // Complete balance max heap, left most child must be
        // filled in before right child
        if (leftValue == null) {
            return;
        }

        // if current value is less than its
        // leftChild and rightChild then exit
        if((currValue.compareTo(leftValue) > 0)
                && (rightValue == null || currValue.compareTo(rightValue) > 0)) {
            return;
        }

        int swapIdx;
        if(rightValue == null) {
            // if right child does not exist
            // then swap with left child
            swapIdx = leftIdx;

        } else if(leftValue.compareTo(rightValue) > 0) {
            // if left child is greater than right child
            // then swap with left child
            swapIdx = leftIdx;

        } else {
            // if right child is greater than or equal to left child
            // then swap with right child
            swapIdx = rightIdx;
        }

        swapValues(idx, swapIdx);
        siftDown(swapIdx, heapSize);
    }

    public void sort() {
        int endOfMaxHeap = this.size() - 1;

        while(endOfMaxHeap > 0) {
            swapValues(0, endOfMaxHeap);
            siftDown(0, endOfMaxHeap);
            endOfMaxHeap--;

        }
    }


    public void print() {
        System.out.println(heap);
    }
}
