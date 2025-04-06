package org.asd;

import java.util.List;

public class JumpSearch implements Searchable {
    @Override
    public <T extends Comparable<T>> int search(List<T> list, T key) {
        if (list.size() == 0) {
            return -1;
        }

        int a = 0;
        int b = (int) Math.sqrt(list.size());

        while (list.get(Math.min(b, list.size()) - 1).compareTo(key) < 0) {
            a = b;
            b += b;

            if (a >= list.size()) {
                return  - 1;
            }
        }

        while (list.get(a).compareTo(key) < 0) {
            a++;
            if (a == Math.min(b, list.size())) {
                return -1;
            }
        }

        if (list.get(a).compareTo(key) == 0) {
            return a;
        } else {
            return -1;
        }
    }
}
