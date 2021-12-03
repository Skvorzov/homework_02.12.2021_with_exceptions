package com.skvortsov;

public interface Stackable {
    void addElement(int element) throws Exception;

    int deleteElement() throws Exception;

    int showTopElement();

    boolean isEmpty();

    boolean isFull();
}