public class Task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("Zest"));
    }
    public static String repFirstChar(String s){
        char c = s.charAt(0);
        int ascii_number = c;
        if(ascii_number >=65 && ascii_number<=90){
          return "upper";
        }
        else if(ascii_number >=97 && ascii_number<=122){
            return "lower";
        }
        else if(ascii_number >=48 && ascii_number<=57){
            return "digit";
        }
        else{
            return "other";
        }
    }
}
