public class Task2 {
    public static void main(String[] args) {
        System.out.println("The sum of arr is: "+calcSumArray(new int[]{1,2,3,4,5}));
    }
    public static int calcSumArray(int[] arr){
        int result = 0;
        for(int i=0;i<arr.length;i++){ // ERROR WAS HERE i=0 must be to include first element of array
            result+=arr[i];
        }
        return result;
    }
}
