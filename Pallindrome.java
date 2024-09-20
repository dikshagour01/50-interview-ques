public class Pallindrome {
    public static boolean pallindromeCheck(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;  // If any mismatch occurs, return false
            }
        }
        return true;  // If no mismatch, the string is a palindrome
    }

    public static void main(String args[]) {
        String str = "racecar";  // Changed input to "racecar" for testing
        System.out.println(pallindromeCheck(str));  // Should print true for "racecar"
    }
}
