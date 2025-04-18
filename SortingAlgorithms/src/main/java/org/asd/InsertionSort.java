package org.asd;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort<T extends Comparable>
        implements Sortable<T> {
    @Override
    public void sort(List<T> list) {
        for(int next = 1; next < list.size(); next++) {
            int curr = next;
            T temp = list.get(next);

            while ((curr > 0) && (temp.compareTo(list.get(curr - 1)) < 0)) {
                list.set(curr, list.get(curr - 1));
                curr--;
            }

            list.set(curr, temp);
        }
    }
}
