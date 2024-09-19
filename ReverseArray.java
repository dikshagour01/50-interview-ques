public class ReverseArray {
    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            // Swap the elements at positions 'first' and 'last'
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            // Move the pointers
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        
        // Print original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse the array
        reverse(arr);

        // Print reversed array
        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
