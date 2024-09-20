public class Armstrong_num{
    public static boolean ArmstrongNumber(int num){
        int sum=0;
        int digitcount=String.valueOf(num).length();
        int originalNum=num;

        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit,digitcount);
            num /=10;
        }
        if(sum!=originalNum){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        int num=153;
        System.out.println(ArmstrongNumber(num));
    }
}