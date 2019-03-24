package com.development.lists;

public class MyArrayList<T> implements List<T> {
    private static final int INIT_SIZE = 16;
    private static final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;

    @Override
    public void add(T item) {
        if (size == array.length - 1) {
            resize(array.length * 2);
        } else {
            array[size++] = item;
        }
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        if (array.length > INIT_SIZE && size < array.length / CUT_RATE)
            resize(array.length / 2);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[INIT_SIZE];
        size = 0;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
