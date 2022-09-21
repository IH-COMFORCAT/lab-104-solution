public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 5, 8, 3, 7, 9,-10, 23};

        int result = differenceSmallestAndLargest(numbers);

        System.out.println(result);

        twoSmallest(numbers);

        System.out.println(resolveEquation(4, 5));
    }

    private static double resolveEquation(double x, double y) {
        return Math.pow(x, 2) + Math.pow(4 * y / 5 - x, 2);
    }

    private static void twoSmallest(int[] numbers) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if (numbers.length < 2) {
            System.err.println("El array debe ser mayor que 1");
        }

        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if(number < secondSmallest) {
                secondSmallest = number;
            }
        }
        System.out.println("El número más pequeño es " + smallest);
        System.out.println("El segundo número más pequeño es " + secondSmallest);

    }

    private static int differenceSmallestAndLargest(int[] numbers) {

        int smallestValue = Integer.MAX_VALUE;
        int largestValue = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallestValue) smallestValue = numbers[i];
            if(numbers[i] > largestValue) largestValue = numbers[i];
        }
        return largestValue - smallestValue;
    }
}