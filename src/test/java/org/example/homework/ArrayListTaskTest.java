package org.example.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTaskTest {

    @Test
    void testAddNewElement() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        ArrayListTask.addNewElement(list);
        assertEquals(4, list.size());
        assertTrue(list.contains("Rustam Saidam"));
        assertTrue(list.contains("Jackson Michael"));
        assertTrue(list.contains("Till Lindemann"));
        assertTrue(list.contains("John Kennedy"));
    }


    @Test
    void testAddNewElementToIndex() {
        ArrayList<String> list = new ArrayList<>();
        ArrayListTask.addNewElementToIndex(list);
        assertEquals(3, list.size());
        assertTrue(list.contains("My lovely grandma"));
        assertTrue(list.contains("My lovely brother"));
        assertTrue(list.contains("My lovely Motherland"));

    }


    @Test
    void testGetElementToIndex() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rustam Saidam");
        list.add("Jackson Michael");
        list.add("Till Lindemann");
        list.add("John Kennedy");
        list.add("My lovely grandma");
        list.add("My lovely Motherland");
        list.add("My lovely brother");
        ArrayListTask.getElementToIndex(list);
        assertEquals("My lovely Motherland", list.get(5));
    }





    @Test
    void testRemoveElementToIndex() {
        ArrayList<String> list = new ArrayList<>();
        list.add("My lovely brother");
        list.add("Jackson Michael");
        list.add("Rustam Saidam");
        list.add("Till Lindemann");
        list.add("John Kennedy");
        list.add("My lovely grandma");
        list.add("My lovely Motherland");
        ArrayListTask.removeElementToIndex(list);
        assertEquals(4, list.size());
        assertTrue(list.contains("Rustam Saidam"));
        assertTrue(list.contains("John Kennedy"));
        assertTrue(list.contains("My lovely grandma"));
        assertTrue(list.contains("My lovely brother"));
    }


    @Test
    void testClearAllList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("My lovely brother");
        list.add("Jackson Michael");
        list.add("Rustam Saidam");
        list.add("Till Lindemann");
        ArrayListTask.clearAllList(list);
        assertEquals(0, list.size());
    }

    @Test
    void quickSortElement() {
    }

    @Test
    void quickSort() {
    }
}