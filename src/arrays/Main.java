package arrays;

import java.util.Arrays;

import static arrays.ArrayClass.find1and4;
import static arrays.ArrayClass.findAllPast4;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(findAllPast4(array1)));
        int[] array2 = {1, 1, 1, 4};
        System.out.println(find1and4(array2));
    }
}
