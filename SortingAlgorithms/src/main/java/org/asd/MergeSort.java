package org.asd;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable>
    implements Sortable<T> {

    @Override
    public void sort(List<T> list) {
        List<T> sortedList = mergeSort(list);
        list.clear();
        list.addAll(sortedList);
    }

    private List<T> mergeSort(List<T> list) {
        if (list.size() <= 1) {
            return new ArrayList<>(list);
        }

        int m = list.size() / 2;

        return merge(mergeSort(list.subList(0,m)), mergeSort(list.subList(m, list.size())));
    }

    private List<T> merge(List<T> left, List<T> right) {
        List<T> resList = new ArrayList<>();
        int i = 0, j = 0;

        while ((i < left.size()) && (j < right.size())) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                resList.add(left.get(i++));
            } else {
                resList.add(right.get(j++));
            }
        }

        while (i < left.size()) {
            resList.add(left.get(i++));
        }

        while (j < right.size()) {
            resList.add(right.get(j++));
        }

        return resList;
    }
}
