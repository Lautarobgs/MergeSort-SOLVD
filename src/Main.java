import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        MergeSort mergeSort = new MergeSort();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            numbers[i] = random.nextInt(100);
        }
        for(int number: numbers){
            System.out.println(number);
        }
        System.out.println("SORTED");
        mergeSort.mergeSort(numbers);
        for(int number: numbers){
            System.out.println(number);
        }
    }
}