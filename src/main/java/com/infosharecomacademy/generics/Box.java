package com.infosharecomacademy.generics;

public class Box<T> {

    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Box{");
        sb.append(item.getClass().getSimpleName().toString());
        sb.append(", item=").append(item);
        sb.append('}');
        return sb.toString();
    }
}
