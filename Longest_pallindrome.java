public class LongestPalindrome {
    // Method to check if a string is a palindrome
    public static boolean palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true; // If no mismatch is found, the string is a palindrome
    }

    // Method to find the longest palindrome in an array of strings
    public static void findLongestPalindrome(String arr[]) {
        String longestPalindrome = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (palindrome(arr[i]) && arr[i].length() > longestPalindrome.length()) {
                longestPalindrome = arr[i]; // Update longest palindrome
            }
        }

        if (!longestPalindrome.isEmpty()) {
            System.out.println("The longest palindrome is: " + longestPalindrome);
        } else {
            System.out.println("No palindrome found.");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"racecar", "apple", "madam", "banana", "civic"};
        findLongestPalindrome(arr);
    }
}
