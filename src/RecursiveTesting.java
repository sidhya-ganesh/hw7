import static org.junit.Assert.*;
import org.junit.Test;

public class RecursiveTesting {

    // ---------- convertIntToString ----------

    @Test
    public void testConvertIntToStringSingleDigitZero() {
        assertEquals("0", RecursivePractice.convertIntToString(0));
    }

    @Test
    public void testConvertIntToStringSingleDigitPositive() {
        assertEquals("7", RecursivePractice.convertIntToString(7));
    }

    @Test
    public void testConvertIntToStringMultiDigitPositive() {
        assertEquals("12345", RecursivePractice.convertIntToString(12345));
    }

    @Test
    public void testConvertIntToStringNegativeNumber() {
        assertEquals("-456", RecursivePractice.convertIntToString(-456));
    }

    // ---------- countSubstrings ----------

    @Test
    public void testCountSubstringsWordShorterThanSubstring() {
        assertEquals(0, RecursivePractice.countSubstrings("hi", "longer"));
    }

    @Test
    public void testCountSubstringsOverlappingMatches() {
        // "aaaa" with "aa" → "aa"(0–1), "aa"(1–2), "aa"(2–3) = 3
        assertEquals(3, RecursivePractice.countSubstrings("aaaa", "aa"));
    }

    @Test
    public void testCountSubstringsNoMatches() {
        assertEquals(0, RecursivePractice.countSubstrings("hello", "zz"));
    }

    @Test
    public void testCountSubstringsSomeMatches() {
        assertEquals(2, RecursivePractice.countSubstrings("ababa", "ab"));
    }

    // ---------- multiplyOdds ----------

    @Test
    public void testMultiplyOddsBaseCaseOne() {
        assertEquals(1, RecursivePractice.multiplyOdds(1));
    }

    @Test
    public void testMultiplyOddsSmallN() {
        // First 3 odd numbers: 1 * 3 * 5 = 15
        assertEquals(15, RecursivePractice.multiplyOdds(3));
    }

    @Test
    public void testMultiplyOddsLargerN() {
        // First 4 odd numbers: 1 * 3 * 5 * 7 = 105
        assertEquals(105, RecursivePractice.multiplyOdds(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyOddsThrowsOnZero() {
        RecursivePractice.multiplyOdds(0);
    }

    // ---------- findSecondLargest (and helper) ----------

    @Test
    public void testFindSecondLargestDistinctValues() {
        int[] arr = {3, 1, 5, 4};
        // largest = 5, secondLargest = 4
        assertEquals(4, RecursivePractice.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargestWithDuplicatesOfLargest() {
        int[] arr = {5, 5, 4};
        // According to implementation: largest = 5, secondLargest = 5
        assertEquals(5, RecursivePractice.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargestTwoElements() {
        int[] arr = {1, 2};
        assertEquals(1, RecursivePractice.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargestAllNegative() {
        int[] arr = {-10, -3, -7};
        // largest = -3, secondLargest = -7
        assertEquals(-7, RecursivePractice.findSecondLargest(arr));
    }

    // ---------- permutation ----------

    @Test
    public void testPermutationBaseCaseRZero() {
        // Any n P 0 = 1
        assertEquals(1.0, RecursivePractice.permutation(5, 0), 0.000001);
    }

    @Test
    public void testPermutationTypicalCase() {
        // 5P2 = 5 * 4 = 20
        assertEquals(20.0, RecursivePractice.permutation(5, 2), 0.000001);
    }

    @Test
    public void testPermutationAnotherCase() {
        // 4P3 = 4 * 3 * 2 = 24
        assertEquals(24.0, RecursivePractice.permutation(4, 3), 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPermutationInvalidWhenNLessThanR() {
        RecursivePractice.permutation(3, 5);
    }

    // ---------- waysToClimb ----------

    @Test
    public void testWaysToClimbBaseCaseOne() {
        assertEquals(1, RecursivePractice.waysToClimb(1));
    }

    @Test
    public void testWaysToClimbBaseCaseTwo() {
        assertEquals(2, RecursivePractice.waysToClimb(2));
    }

    @Test
    public void testWaysToClimbThreeStairs() {
        // ways(3) = ways(2) + ways(1) = 2 + 1 = 3
        assertEquals(3, RecursivePractice.waysToClimb(3));
    }

    @Test
    public void testWaysToClimbFourStairs() {
        // ways(4) = ways(3) + ways(2) = 3 + 2 = 5
        assertEquals(5, RecursivePractice.waysToClimb(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWaysToClimbThrowsOnZero() {
        RecursivePractice.waysToClimb(0);
    }
}
