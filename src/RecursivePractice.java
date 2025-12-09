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



}
