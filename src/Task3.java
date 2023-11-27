import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = function(6);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] function(int n){
        Random random = new Random();
        int[] array = new int[n];
        int sum=0;
        for(int i=0; i<array.length;i++){
            if(i==array.length-1){
                if (sum>0) array[i]=-sum;
                else array[i]=-1*sum;
                continue;
            }
            int number = random.nextInt(30 + 30) - 30;
            boolean flag = true;
            while(true){
                for(int j=0; j<i;j++){
                    if(number == array[j]) flag = false;
                }
                if(flag == true) break;
            }
            array[i]=number;
            sum+=number;
        }
        return array;

    }
}
