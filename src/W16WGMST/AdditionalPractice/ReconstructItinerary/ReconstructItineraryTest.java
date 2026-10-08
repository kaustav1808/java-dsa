package W16WGMST.AdditionalPractice.ReconstructItinerary;

import common.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static common.TestUtil.list;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Official examples for 332. Reconstruct Itinerary
 * https://leetcode.com/problems/reconstruct-itinerary/
 * Add your own edge cases as extra @Test methods.
 */
@DisplayName("332. Reconstruct Itinerary")
public class ReconstructItineraryTest {

    @Test
    @DisplayName("Example 1: tickets = [[\"MUC\",\"LHR\"],[\"JFK\",\"MUC\"],[\"SFO\",\"SJC\"],[\"LHR\",\"SFO\"]] -> [\"JFK\",\"MUC\",\"LHR\",\"SFO\",\"SJC\"]")
    void example1() {
        List<List<String>> tickets = list(
                list("MUC", "LHR"),
                list("JFK", "MUC"),
                list("SFO", "SJC"),
                list("LHR", "SFO"));
        List<String> expected = list("JFK", "MUC", "LHR", "SFO", "SJC");
        List<String> actual = new ReconstructItinerary().findItinerary(tickets);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: tickets = [[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]] -> [\"JFK\",\"ATL\",\"JFK\",\"SFO\",\"ATL\",\"SFO\"]")
    void example2() {
        List<List<String>> tickets = list(
                list("JFK", "SFO"),
                list("JFK", "ATL"),
                list("SFO", "ATL"),
                list("ATL", "JFK"),
                list("ATL", "SFO"));
        List<String> expected = list("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        List<String> actual = new ReconstructItinerary().findItinerary(tickets);

        assertEquals(expected, actual);
    }
}
