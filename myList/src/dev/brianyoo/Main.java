package dev.brianyoo;


public class Main {

    public static void main(String[] args) {

        System.out.println("===========");
        System.out.println("MyStack:");

        MyStack<Integer> stackInt = new MyStack<>();
        stackInt.add(3);
        stackInt.add(5);
        stackInt.print();
        stackInt.add(6);
        stackInt.print();
        System.out.println(stackInt.remove());
        stackInt.print();

        System.out.println("===========");
        System.out.println("MyQueue");

        MyQueue<Integer> queueInt = new MyQueue<>();
        queueInt.add(2);
        queueInt.add(1);
        queueInt.print();
        queueInt.add(4);
        queueInt.print();
        queueInt.remove();
        queueInt.print();


        System.out.println("===========");
        System.out.println("MyMaxHeap:");

        MyMaxHeap<Integer> maxHeapInt = new MyMaxHeap<>();
        maxHeapInt.add(20);
        maxHeapInt.print();
        maxHeapInt.add(23);
        maxHeapInt.print();
        maxHeapInt.add(12);
        maxHeapInt.print();
        maxHeapInt.add(19);
        maxHeapInt.print();
        maxHeapInt.add(60);
        maxHeapInt.print();
        maxHeapInt.add(30);
        maxHeapInt.print();
        maxHeapInt.add(14);
        maxHeapInt.print();
        maxHeapInt.add(15);
        maxHeapInt.print();

        maxHeapInt.remove();
        maxHeapInt.print();
        maxHeapInt.add(100);
        maxHeapInt.print();

        maxHeapInt.sort();
        maxHeapInt.print();
    }
}
