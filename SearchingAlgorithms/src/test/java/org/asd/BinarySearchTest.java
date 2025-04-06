package org.asd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    void searchIntegerListShouldEqualPositiveInt() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99);

        assertEquals(binarySearch.search(list, 10), 9);
    }

    @Test
    void searchIntegerListShouldEqualNegativeInt() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99);

        assertEquals(binarySearch.search(list, 12), -1);
    }

    @Test
    void searchIntegerWithEmptyList() {
        List<Integer> list = Arrays.asList();
        assertEquals(binarySearch.search(list, 5), -1);
    }

    @Test
    void searchWithMillionLengthListIntegers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 999999; i++) {
            list.add((int) Math.random() * 100);
        }
        list.add(99999);

        assertEquals(binarySearch.search(list, 99999), 999999);
    }

    @Test
    void searchStringsListShouldEqualPositiveInt() {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee", "ffff", "gggg", "hhhh", "iiii", "jjjj");

        assertEquals(binarySearch.search(list, "aaaa"), 0);
    }

    @Test
    void searchStringsListShouldEqualNegativeInt() {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee", "ffff", "gggg", "hhhh", "iiii", "jjjj");

        assertEquals(binarySearch.search(list, "zzzz"), -1);
    }
}