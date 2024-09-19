public class PerfectNumber {
    // Method to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 0;

        // Find divisors and calculate their sum
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to the sum
            }
        }

        // If sum of divisors equals the number, it is perfect
        return sum == num;
    }

    public static void main(String[] args) {
        // Example numbers to check
        int number1 = 6;
        int number2 = 28;
        int number3 = 12;  // This is not a perfect number

        // Check and print results
        System.out.println(number1 + " is a perfect number: " + isPerfect(number1));
        System.out.println(number2 + " is a perfect number: " + isPerfect(number2));
        System.out.println(number3 + " is a perfect number: " + isPerfect(number3));
    }
}
