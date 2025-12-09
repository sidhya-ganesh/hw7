public class RecursivePractice {
    public static String convertIntToString(int x) {
        //base case: single-digit (positive)
        if (x >= 0 && x<=9) {
            char c = (char) ('0' + x);
            return Character.toString(c);
        }
        if (x < 0) {
            return "-" + convertIntToString(-x);
        }
        return convertIntToString(x/10) + ((char) ('0' + (x%10)));
    }
    public static int countSubstrings(String word, String substring) {
        // base case --> word length < substring length
        if (word.length() < substring.length()) {
            return 0;
        }
        if (word.substring(0, substring.length()).equals(substring)) {
            return 1 + countSubstrings(word.substring(1), substring);
        }
        else {
            return countSubstrings(word.substring(1), substring);
        }
    }
    public static int multiplyOdds(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        // Base case: first odd number is 1
        if (n == 1) {
            return 1;
        }
        // nth odd number = 2*n - 1
        int odd = 2 * n - 1;
        // Recursive step
        return odd * multiplyOdds(n - 1);
    }



}
