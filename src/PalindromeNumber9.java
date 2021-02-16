public class PalindromeNumber9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int x) {
        int ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return false;

    }

    public static boolean isPalindrome2(int x) {
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            remainder = x % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            x = x / 10;
        }
        if (reversedInteger == originalInteger) {
            return true;
        } else {
            return false;
        }
    }
}
