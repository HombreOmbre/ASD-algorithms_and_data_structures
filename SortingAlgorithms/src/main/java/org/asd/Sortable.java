package org.asd;

import java.util.List;

public interface Sortable<T extends Comparable>  {
    void sort(List<T> list);
}
