public class leap_yr{
    public static boolean leapYear(int year){
        if(year%4==0){
            if(year%100!= 0 || year%400==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int year=2000;
        System.out.println(leapYear(year));
    }
}