public class PalindromeDigit {
    public static boolean PalindromeCheck(int num1) {
        String str = String.valueOf(num1); 
        int len = str.length(); 
        
        for (int i = 0; i < len / 2; i++) {
            
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String args[]) {
        int num1=12327;
        PalindromeCheck(num1);
        System.out.println(PalindromeCheck(num1));
    }
}
       
