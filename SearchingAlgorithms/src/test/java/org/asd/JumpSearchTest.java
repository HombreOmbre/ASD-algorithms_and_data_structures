package org.asd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JumpSearchTest {
    
    JumpSearch jumpSearch = new JumpSearch();

    @Test
    void testJumpSearch() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99);

        assertEquals(jumpSearch.search(list, 99), 18);
    }

    @Test
    void testJumpSearchWithNegativeInt() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99);

        assertEquals(jumpSearch.search(list, 100), -1);
    }

    @Test
    void testJumpESearchWithEmptyList() {
        List<Integer> list = Arrays.asList();

        assertEquals(jumpSearch.search(list, 100), -1);
    }

    @Test
    void searchJumpWithMillionLengthListIntegers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 999999; i++) {
            list.add(i * 2);
        }

        assertEquals(jumpSearch.search(list, 1500000), 750000);
    }

    @Test
    void searchJumpStringsListShouldEqualPositiveInt() {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee", "ffff", "gggg", "hhhh", "iiii", "jjjj");

        assertEquals(jumpSearch.search(list, "aaaa"), 0);
    }

    @Test
    void searchJumpStringsListShouldEqualNegativeInt() {
        List<String> list = Arrays.asList("aaaa", "bbbb", "cccc", "dddd", "eeee", "ffff", "gggg", "hhhh", "iiii", "jjjj");

        assertEquals(jumpSearch.search(list, "zzzz"), -1);
    }
}