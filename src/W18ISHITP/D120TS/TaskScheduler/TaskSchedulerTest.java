package W18ISHITP.D120TS.TaskScheduler;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 621. Task Scheduler
 * https://leetcode.com/problems/task-scheduler/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("621. Task Scheduler")
public class TaskSchedulerTest {

    @Test
    @DisplayName("Example 1: tasks = [\"A\",\"A\",\"A\",\"B\",\"B\",\"B\"], n = 2 -> 8")
    void example1() {
        char[] tasks = new char[] {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int expected = 8;
        int actual = new TaskScheduler().leastInterval(tasks, n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: tasks = [\"A\",\"C\",\"A\",\"B\",\"D\",\"B\"], n = 1 -> 6")
    void example2() {
        char[] tasks = new char[] {'A', 'C', 'A', 'B', 'D', 'B'};
        int n = 1;
        int expected = 6;
        int actual = new TaskScheduler().leastInterval(tasks, n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: tasks = [\"A\",\"A\",\"A\", \"B\",\"B\",\"B\"], n = 3 -> 10")
    void example3() {
        char[] tasks = new char[] {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 3;
        int expected = 10;
        int actual = new TaskScheduler().leastInterval(tasks, n);

        assertEquals(expected, actual);
    }
}
