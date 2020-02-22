package daksh;

public class Palindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int copy = number;
        while (copy != 0) {
            int lastdidgit = copy % 10;
            reverse = (reverse * 10) + lastdidgit;
            copy = copy / 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

