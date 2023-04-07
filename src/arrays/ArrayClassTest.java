package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static arrays.ArrayClass.find1and4;
import static arrays.ArrayClass.findAllPast4;

public class ArrayClassTest {
    @Test
    public void findAllPast4Test_success1() {
        int[] initial = {4, 3, 9, 3, 9};
        int[] expected = {3, 9, 3, 9};
        int[] actual = findAllPast4(initial);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllPast4Test_success2() {
        int[] initial = {6, 0, 2, 4, 9};
        int[] expected = {9};
        int[] actual = findAllPast4(initial);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllPast4Test_success3() {
        int[] initial = {8, 5, 2, 2, 11, 4, 68, 3};
        int[] expected = {68, 3};
        int[] actual = findAllPast4(initial);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllPast4Test_exception() {
        int[] initial = {8, 5, 2, 2, 11, 5, 68, 3};
        Assertions.assertThrows(RuntimeException.class,
                () -> findAllPast4(initial));
    }

    @Test
    public void findAllPast4Test_null() {
        int[] initial = null;
        int[] actual = findAllPast4(initial);
        Assertions.assertArrayEquals(null, actual);
    }
    @Test
    public void find1and4Test_success1(){
        int[] initial = {1,1,4,4,1,4};
        boolean expected = true;
        boolean actual = find1and4(initial);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void find1and4Test_success2(){
        int[] initial = {1,1,1,1,1,1};
        boolean expected = false;
        boolean actual = find1and4(initial);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void find1and4Test_success3(){
        int[] initial = {4,4,4,4,4,4};
        boolean expected = false;
        boolean actual = find1and4(initial);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void find1and4Test_success4(){
        int[] initial = {1,1,4,8,1,4};
        boolean expected = false;
        boolean actual = find1and4(initial);
        Assertions.assertEquals(expected, actual);
    }
}
