public class Task {
    public static void main(String[] args) {
        /*
int[] array = new int[10];
for(int i = 0; i < array.length; i++){
    array[i] = i + 2;
    System.out.println(array[i]);
} */

      /*  int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
            System.out.println(array[i]);
        } */ /*
        int[] array = new int[6];
        for(int i = 6; i > array.length; i--){
            array[i] = i - 1;
            System.out.println(array[i]);
        } */
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
        for (int i = array.length - 1; i>= 0; i--){
            System.out.println(array[i]);
        }
        for (int i  = 0; i < array.length;i++ ){
            int temp = array[i];
            array[i] = array[array.length - (1+i)];
            array[array.length-1] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
