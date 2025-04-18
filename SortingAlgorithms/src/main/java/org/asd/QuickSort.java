package org.asd;

import java.util.List;

public class QuickSort<T extends Comparable>
    implements Sortable<T> {
    @Override
    public void sort(List<T> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(List<T> list, int left, int right) {
      if (left >= right) {
          return;
      }

      int k = partition(list, left, right);

      quickSort(list, left, k - 1);
      quickSort(list, k + 1, right);
    }

    private int partition(List<T> list, int left, int right) {
        int i = left + 1;
        int j = right;
        T pivot = list.get(left);
        T temp;

        do {
            while ((i < right) && (list.get(i).compareTo(pivot) <= 0)) i++;
            while ((j > i) && (list.get(j).compareTo(pivot) >= 0)) j--;

            if (i < j) {
                temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        } while (i < j);

        if (list.get(i).compareTo(pivot) > 0) {
            list.set(left, list.get(i - 1));
            list.set(i - 1, pivot);
            return i - 1;
        } else {
            list.set(left, list.get(i));
            list.set(i, pivot);
            return i;
        }
    }
}
