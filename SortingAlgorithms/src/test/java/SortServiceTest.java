import org.asd.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortServiceTest {

    List<Integer> integerList;
    List<String> stringList;

    @BeforeEach
    void setUp() {
        integerList = new ArrayList<>(Arrays.asList(9,2,4,3,1,5,8,6,0,7));
        stringList = new ArrayList<>(Arrays.asList("x", "t", "a", "r", "e", "c", "j", "d"));
    }

    @Test
    void selectionSortForIntegers() {
        SortService sortService = new SortService(new SelectionSort());

        sortService.sort(integerList);

        assertEquals(List.of(0,1,2,3,4,5,6,7,8,9), integerList);
    }

    @Test
    void selectionSortForStrings() {
        SortService sortService = new SortService(new SelectionSort());

        sortService.sort(stringList);

        assertEquals(List.of("a", "c", "d", "e", "j", "r", "t", "x"), stringList);
    }

    @Test
    void insertionSortForIntegers() {
        SortService sortService = new SortService(new InsertionSort());

        sortService.sort(integerList);

        assertEquals(List.of(0,1,2,3,4,5,6,7,8,9), integerList);
    }

    @Test
    void insertionSortForStrings() {
        SortService sortService = new SortService(new InsertionSort());

        sortService.sort(stringList);

        assertEquals(List.of("a", "c", "d", "e", "j", "r", "t", "x"), stringList);
    }

    @Test
    void mergeSortForIntegers() {
        SortService sortService = new SortService(new MergeSort());

        sortService.sort(integerList);

        assertEquals(List.of(0,1,2,3,4,5,6,7,8,9), integerList);
    }

    @Test
    void mergeSortForStrings() {
        SortService sortService = new SortService(new MergeSort());

        sortService.sort(stringList);

        assertEquals(List.of("a", "c", "d", "e", "j", "r", "t", "x"), stringList);
    }

    @Test
    void quickSortForIntegers() {
        SortService sortService = new SortService(new QuickSort());

        sortService.sort(integerList);

        assertEquals(List.of(0,1,2,3,4,5,6,7,8,9), integerList);
    }

    @Test
    void quickSortForStrings() {
        SortService sortService = new SortService(new QuickSort());

        sortService.sort(stringList);

        assertEquals(List.of("a", "c", "d", "e", "j", "r", "t", "x"), stringList);
    }
}
