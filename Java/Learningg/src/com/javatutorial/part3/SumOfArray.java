package Learningg.src.com.javatutorial.part3;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);

    }
    public static void sumOfNumbersInArray(int[] numbers){
        int sum = 0;
        for (int a = 0; a < numbers.length; a++) {
            sum = sum + numbers[a];

        }
        System.out.println(sum);
    }
}
