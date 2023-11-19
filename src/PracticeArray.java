public class PracticeArray {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 5, 2, 5, 2, 5, 2, 5};

        int sum = 0;
        for (int j : score) {
            sum += j;
        }

        System.out.println("Sum: " + sum);
    }
}