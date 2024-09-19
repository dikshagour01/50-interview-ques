public class ReverseNum {
    // Method to reverse the number and return it
    public static int Reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit from original number
        }
        return reversed; // Return the reversed number
    }

    public static void main(String[] args) {
        int num = 123;
        int reversedNum = Reverse(num); // Get the reversed number
        System.out.println("Reversed number: " + reversedNum); // Print the reversed number
    }
}
