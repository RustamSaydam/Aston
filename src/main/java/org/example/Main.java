package org.example;

import org.example.homework.ArrayListTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayListTask.addNewElement(list);
        ArrayListTask.addNewElementToIndex(list);
        ArrayListTask.getElementToIndex(list);
        ArrayListTask.removeElementToIndex(list);
        ArrayListTask.clearAllList(list);
        ArrayListTask.quickSortElement(list);
    }
}
