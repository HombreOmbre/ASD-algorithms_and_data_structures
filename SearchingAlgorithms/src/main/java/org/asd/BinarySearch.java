package org.asd;

import java.util.List;

public class BinarySearch implements Searchable {

    @Override
    public <T extends Comparable<T>> int search(List<T> list, T key) {
        int left = 0;
        int right = list.size() - 1;

        while(left <= right) {
            int middle = (left + right) / 2;
            int compare = list.get(middle).compareTo(key);

            if (list.get(middle).compareTo(key) == 0) {
                return middle;
            } else {
                if (compare > 0) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }

        return  -1;
    }
}
