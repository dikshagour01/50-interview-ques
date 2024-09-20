public class Natural_num_sum{
    public static int TotalSum(int num){
        if(num==0 || num==1){
            return num;
        }
        return num+TotalSum(num-1);
    }
    public static void main(String args[]){
        int num=5;
        System.out.println(TotalSum(num));
    }
}