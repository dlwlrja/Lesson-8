import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] people = new int[5];
        for (int i =0; i< people.length; i++){
            people[i] = new Random().nextInt(100);
        }
        int summ = 0;
        for (int i = 0; i< people.length; i++){
            summ = summ + people[i];
        }
        System.out.println("Средний возраст: "+ summ/ people.length);
        /*int[] array = new int[10];
        for (int i = 0; i<array.length; i++) {
            array[i] = i + 10;
        }
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        } */
    }
}
