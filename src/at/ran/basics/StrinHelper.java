package at.ran.basics;

public class StrinHelper {
    public static void main(String[] args) {
        boolean result = isPalindrome("AnnA");
    }

    public static boolean isPalindrome(String text) {
        char[] data = text.toCharArray();
        int backPosition = data.length - 1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[backPosition - i]) {

                return false;
            }
        }

        return true;
    }
}
