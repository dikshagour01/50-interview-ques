public class Euclid_GCD {
    // Recursive method to calculate GCD
    public static int findGCD(int a, int b) {
        // Base case: if b is 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive call: GCD(b, a % b)
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        // Example numbers
        int num1 = 24;
        int num2 = 36;

        // Find GCD using recursion
        int gcd = findGCD(num1, num2);

        // Output the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        // Another example
        int num3 = 54;
        int num4 = 72;

        int gcd2 = findGCD(num3, num4);
        System.out.println("GCD of " + num3 + " and " + num4 + " is: " + gcd2);
    }
}
