package lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T extends Comparable<T>> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <=0 " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Comparable[capacity];
    }

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Comparable[capacity];
    }

    public void add(T item) {
        if (isFull()) {
            capacityIncrease();
        }
        list[size] = item;
        size++;
    }

    private void capacityIncrease() {
        capacity *= 1.5;
        list = Arrays.copyOf(list, capacity);
    }

    public void add(int index, T item) {
        if (isFull()) {
            capacityIncrease();
        }
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Недопустимый индекс: " + index);
        }

        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    private boolean isFull() {
        return size == list.length;
    }

    public final T remove(int index) {
        if (index < 0 || index > size() - 1) {
            throw new IllegalArgumentException("Недопустимый индекс: " + index);
        }
        T temp = list[index];
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        list[size] = null;
        return temp;
    }

    public boolean remove(T item) {
        int i = indexOf(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        if (index < 0 || index > size() - 1) {
            throw new IllegalArgumentException("Недопустимый индекс: " + index);
        }
        return list[index];
    }

    public void set(int index, T item) {
        if (index < 0 || index > size() - 1) {
            throw new IllegalArgumentException("Недопустимый индекс: " + index);
        }
        list[index] = item;
    }

    public int size() {
        return size;
    }

}
