package dev.brianyoo;

import java.util.*;

public interface MyArray<E> {

    void add(E item);

    E remove();

    E peek();

    int size();

    boolean isEmpty();
}
