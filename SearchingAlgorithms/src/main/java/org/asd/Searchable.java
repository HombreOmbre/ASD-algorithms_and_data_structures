package org.asd;

import java.util.List;

public interface Searchable {
    <T extends Comparable<T>> int search(List<T> list, T key);
}
