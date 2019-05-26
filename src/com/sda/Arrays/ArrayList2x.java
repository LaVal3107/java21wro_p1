package com.sda.Arrays;

public class ArrayList2x<T> implements IList<T> {
    private T[] array;
    private final int arraySizeMultipler = 2;
    private int size;

    public ArrayList2x(){
        array = (T[]) new Object[arraySizeMultipler];
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T value) {
        if (array.length > size) {
            array[size] = value;
            ++size;
            return;
        }
        int newArraySize = array.length * arraySizeMultipler;
        T[] tmp = (T[]) new Object[newArraySize];
        for (int i = 0; i < array.length; i++)
            tmp[i] = array[i];
        tmp[size] = value;
        array = tmp;
        ++size;
    }

    @Override
    public void add(int index, T value) {
        if (index >size)
            throw new IndexOutOfBoundsException();
        int newArraySize = array.length > size ?
                array.length : array.length * arraySizeMultipler;

        T[] tmp = (T[]) new Object[newArraySize];
        int i;
        for (i = 0; i < index; i++) {
            tmp[i] = array[i];
        }
        tmp[index] = value;
        for (i = index + 1; i < array.length + 1; i++)
            tmp[i] = array[i - 1];
        size++;

    }

    @Override
    public T get(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }

    @Override
    public void remove(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException();
        T[] tmp = (T[]) new Object[array.length];
        for (int i = 0; i < index; i++)
            tmp[i] = array[i];
        for (int i = index + 1; i <array.length ; i++)
            tmp[i-1] = array[i];
        array = tmp;
        size--;
    }


}
