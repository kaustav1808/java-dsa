package W6HSMS.D37THRM.FindMedianFromDataStream;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 295. Find Median from Data Stream
 * https://leetcode.com/problems/find-median-from-data-stream/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("295. Find Median from Data Stream")
public class MedianFinderTest {

    @Test
    @DisplayName("Example 1: [\"MedianFinder\", \"addNum\", \"addNum\", \"findMedian\", \"addNum\", \"findMedian\"] [[], [1], [2], [], [3], []] -> [null, null, null, 1.5, null, 2.0]")
    void example1() {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        double r3 = obj.findMedian();
        obj.addNum(3);
        double r5 = obj.findMedian();

        assertEquals(1.5, r3, 1e-5);
        assertEquals(2.0, r5, 1e-5);
    }
}
