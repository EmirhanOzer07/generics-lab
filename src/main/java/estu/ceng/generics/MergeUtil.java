package estu.ceng.generics;

import java.util.ArrayList;
import java.util.List;

public class MergeUtil {

    public static <T extends Comparable<? super T>> List<T> merge(
            List<? extends T> list1, List<? extends T> list2) {

        List<T> result = new ArrayList<>(list1.size() + list2.size());

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            T a = list1.get(i);
            T b = list2.get(j);

            if (a.compareTo(b) <= 0) {
                result.add(a);
                i++;
            } else {
                result.add(b);
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i++));
        }
        while (j < list2.size()) {
            result.add(list2.get(j++));
        }

        return result;
    }
}
