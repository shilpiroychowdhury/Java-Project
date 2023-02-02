import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = new int[firstArray.length / 2 + firstArray.length % 2];
        int j = 0;

        for (int i = 0; i < firstArray.length; i += 2) {
            secondArray[j++] = firstArray[i];
        }

        System.out.println("First Array: " + Arrays.toString(firstArray));
        System.out.println("Second Array: " + Arrays.toString(secondArray));
    }
}
