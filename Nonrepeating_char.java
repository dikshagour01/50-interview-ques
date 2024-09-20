public class Nonrepeating_char{
    public static void NonRepeatingChar(String str){
        int charcount[]= new int[256];

        for(int i=0; i<str.length(); i++){
            charcount[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (charcount[str.charAt(i)] == 1) {
                System.out.print(str.charAt(i) + " ");
            }
        }

    }
    public static void main(String args[]){
        String str="programming";
        NonRepeatingChar(str);
    }
}