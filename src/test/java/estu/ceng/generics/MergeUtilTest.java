package estu.ceng.generics;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MergeUtilTest {

    @Test
    void mergeSortedIntegerLists() {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 7);

        List<Integer> merged = MergeUtil.merge(list1, list2);

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7), merged);
    }

    @Test
    void mergeWithSubtypesAndComparable() {
        List<Integer> list1 = Arrays.asList(1, 2, 8);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        List<Integer> merged = MergeUtil.merge(list1, list2);

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 8), merged);
    }
}
