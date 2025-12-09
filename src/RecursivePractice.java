import java.util.ArrayList;

public class RecursivePractice {

    // 1) convertIntToString
    public static String convertIntToString(int x) {
        // base case: single-digit (positive or zero)
        if (x >= 0 && x <= 9) {
            char c = (char) ('0' + x);
            return Character.toString(c);
        }
        if (x < 0) {
            return "-" + convertIntToString(-x);
        }
        // recursive case: peel off last digit
        return convertIntToString(x / 10) + (char) ('0' + (x % 10));
    }

    // 2) countSubstrings
    public static int countSubstrings(String word, String substring) {
        // base case
        if (word.length() < substring.length()) {
            return 0;
        }
        if (word.substring(0, substring.length()).equals(substring)) {
            return 1 + countSubstrings(word.substring(1), substring);
        } else {
            return countSubstrings(word.substring(1), substring);
        }
    }

    // 3) multiplyOdds
    public static int multiplyOdds(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        // base: first odd number
        if (n == 1) {
            return 1;
        }
        int odd = 2 * n - 1;
        return odd * multiplyOdds(n - 1);
    }

    // 4) findSecondLargest (and helper)
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        return findSecondLargestHelper(arr, 0, largest, secondLargest);
    }

    private static int findSecondLargestHelper(int[] arr, int index,
                                               int largest, int secondLargest) {
        if (index == arr.length) {
            return secondLargest;
        }
        int current = arr[index];
        if (current > largest) {
            secondLargest = largest;
            largest = current;
        } else if (current > secondLargest) {
            secondLargest = current;
        }
        return findSecondLargestHelper(arr, index + 1, largest, secondLargest);
    }

    // 5) permutation
    public static double permutation(int n, int r) {
        if (n < 0 || r < 0 || n < r) {
            throw new IllegalArgumentException("Invalid n or r");
        }
        if (r == 0) {
            return 1.0;
        }
        return n * permutation(n - 1, r - 1);
    }

    // 6) waysToClimb
    public static int waysToClimb(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return waysToClimb(n - 1) + waysToClimb(n - 2);
    }
}
