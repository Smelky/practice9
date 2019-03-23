package com.development.mystack;

public interface StackList<T> {
    void push(T item);

    T pop();

    T peek();

    int size();

    void clear();

    void remove(int index);
}
