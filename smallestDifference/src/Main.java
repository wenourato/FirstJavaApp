public class Main {

//    public static void main(String[] args) {
    //Find the smallest difference from the sequence of numbers [3,9,50,15,99,7,98,65]

    public static int findLowestDifference1(List<Integer> numbers, int size) {
        int difference = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                count++;
                if (Math.abs(numbers.get(i) - numbers.get(j)) < difference) {
                    difference = Math.abs(numbers.get(i) - numbers.get(j));
                }
            }
        }
        System.out.println("count: " + count);
        System.out.println("Difference: " + difference);
        return difference;
    }

    // O(n log(n)) --------------OPTIMIZED SOLUTION.
    public static int findLowestDifference2(List<Integer> numbers, int size) {
        Collections.sort(numbers);

        int difference = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < size - 1; i++) {
            count++;
            if (numbers.get(i + 1) - numbers.get(i) < difference) {
                difference = numbers.get(i + 1) - numbers.get(i);
            }
        }

        System.out.println("count: " + count);
        System.out.println("Difference: " + difference);
        return difference;
    }
}