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
        } */
        int[] array = new int[6];
        for(int i = 6; i > array.length; i--){
            array[i] = i - 1;
            System.out.println(array[i]);
        }

    }
}
