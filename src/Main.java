public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 8, 3, 7, 9,-10, 23};

        int result = differenceTwoSmallest(numbers);

        System.out.println(result);


    }

    private static int differenceTwoSmallest(int[] numbers) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest) smallest = numbers[i];
            if(numbers[i] > largest) largest = numbers[i];
        }
        return largest - smallest;
    }
}