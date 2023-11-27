public class Task4 {
    public static void main(String[] args) {
        System.out.println("Max member of family is: "+maxFamily(213));
    }
    public static int maxFamily(int n){
        String nStr = Integer.toString(n);
        int[] array = new int[nStr.length()];
        for(int i=0;i<array.length;i++){
            array[i] = Character.getNumericValue(nStr.charAt(i));  //array[i] = Integer.parseInt(String.valueOf(nStr.charAt(i)));
        }
        array = bbleSort(array);
        String temp_str = "";
        for(int i=array.length-1; i>=0;i--){
            temp_str += array[i];
        }
        return Integer.parseInt(temp_str);
    }
    public static int[] bbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
