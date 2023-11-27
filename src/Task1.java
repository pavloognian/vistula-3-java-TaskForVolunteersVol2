public class Task1 {
    public static String signs(int n){
        String temp_str="";
        for(int i=0; i<n;i++){
            if (i%2==0){temp_str+="+";}
            else{temp_str+="-";}
        }
        return temp_str;
    }
    public static void main(String[] args) {
        System.out.println(signs(5));
        System.out.println(signs(8));

    }


}
