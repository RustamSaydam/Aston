package org.example.homework;

import java.util.ArrayList;

public class ArrayListTask {

    public static void addNewElement(ArrayList<String> list) {
        list.add("Rustam Saidam");
        list.add("Jackson Michael");
        list.add("Till Lindemann");
        list.add("John Kennedy");

        System.out.println("All element: " + list);
    }

    public static void addNewElementToIndex(ArrayList<String> list) {
        list.add(0, "My lovely grandma");
        list.add(1, "My lovely brother");
        list.add(2, "My lovely Motherland");
        System.out.println("All element and added element to index: " + list);
    }

    public static void getElementToIndex(ArrayList<String> list) {
        String element = list.get(5);
        System.out.println("Get element to index: " + element);

    }

    public static void removeElementToIndex(ArrayList<String> list) {
        list.remove("Till Lindemann");
        list.remove("Jackson Michael");
        list.remove("My lovely Motherland");
        System.out.println("The list with deleted element: " + list);
    }

    public static void clearAllList(ArrayList<String> list) {
        list.clear();
        System.out.println("Clear list: " + list);

    }

    public static void quickSortElement(ArrayList<String> list) {
        quickSort(list);

    }

    public static void quickSort(ArrayList<String> list) {
        if (list.size() <= 1) {
            return;
        }

        int pivotIndex = list.size() / 2;
        String pivot = list.get(pivotIndex);

        ArrayList<String> less = new ArrayList<>();
        ArrayList<String> greater = new ArrayList<>();

        for (String item : list) {
            if (item.compareTo(pivot) < 0) {
                less.add(item);
            } else {
                greater.add(item);
            }
        }

        quickSort(less);
        quickSort(greater);

        list.clear();
        list.addAll(less);
        list.add(pivot);
        list.addAll(greater);
    }
}
