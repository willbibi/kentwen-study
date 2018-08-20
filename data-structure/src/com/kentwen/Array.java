package com.kentwen;

/**
 * Created by 毕文 on 2018/6/25.
 */
public class Array {

    private int[] data;

    private int size;

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    // 无参数构造函数，默认数组的容量capacity=10
    public Array() {
        this(10);
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    // 获取数组中的容量
    public int getCapacity() {
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 向所有元素后添加一个元素
    public void addLast(int e) {
        add(size, e);
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e) {
        add(0, e);
    }

    // 向第index个索引插入一个新元素e
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed; Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed; Required index>=0 and index<=size.");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // 获取index索引位置的元素
    int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get failed;Index is illegal.");
        }
        return data[index];
    }

    // 修改index索引位置的元素为e
    void set(int index, int e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Set failed;Index is illegal.");
        }
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (e == data[i]) {
                return true;
            }
        }
        return false;
    }

    //  查找数组中元素e所在的索引，如果不存在元素e,则返回-1
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (e == data[i]) {
                return i;
            }
        }
        return -1;
    }

    // 从数组中删除index位置的元素，返回删除元素
    public int remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Remove failed; Required index>=0 and index<=size.");
        }
        int ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    // 从数组中删除第一个元素，返回删除元素
    public int removeFirst() {
        return remove(0);
    }

    //从数组中删除最后一个元素，返回删除元素
    public int removeLast() {
        return remove(size - 1);
    }

    // 从数组中删除元素e
    public void removeElement(int e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
