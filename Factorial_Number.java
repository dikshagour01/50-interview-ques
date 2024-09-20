public class FactorialNumber {
    // Recursive method to calculate the factorial of a number
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return num * factorial(num - 1); // Recursive call
    }

    public static void main(String args[]) {
        int num = 4;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
