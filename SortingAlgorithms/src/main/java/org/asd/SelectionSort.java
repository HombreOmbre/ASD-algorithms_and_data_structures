package org.asd;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort<T extends Comparable>
        implements Sortable<T> {
    @Override
    public void sort(List<T> list) {
        int i = 0;

        while (i < list.size()) {
            int mini = indexOfMin(list, i);
            swap(list, i, mini);
            i++;
        }
    }

    private int indexOfMin(List<T> list, int index) {
        int min = index;

        for (int i = index + 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(min)) < 0) {
                min = i;
            }
        }

        return min;
    }

    private void swap(List<T> list, int index, int mini) {
        T tmp = list.get(index);
        list.set(index, list.get(mini));
        list.set(mini, tmp);
    }
}
