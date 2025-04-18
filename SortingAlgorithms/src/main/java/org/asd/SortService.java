package org.asd;

import java.util.List;

public class SortService {
    Sortable sorter;

    public SortService(Sortable sorter) {
        this.sorter = sorter;
    }

    public <T extends Comparable> void sort(List<T> list) {
        sorter.sort(list);
    }
}
