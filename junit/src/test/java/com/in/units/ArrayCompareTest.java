package com.in.units;

import static org.junit.Assert.assertArrayEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Test;

public class ArrayCompareTest {

    @Test
    public void test_ArraySort() {
        int[] numberArray = {12, 2, 3, 8, 10};
        int[] expectedValue = {2, 3, 8, 10, 12};
        Arrays.sort(numberArray);
        assertArrayEquals(expectedValue, numberArray);
    }

    /* @Test
    public void test_ArrayIsNull() {
        int[] numberArray = null;
        // Arrays.sort(numberArray);
        try {
            Arrays.sort(numberArray);
        } catch (NullPointerException e) {
            // Success
        }
    } */

    @Test(expected = NullPointerException.class)
    public void test_ArrayIsNull() {
        int[] numberArray = null;
            Arrays.sort(numberArray);
    }

    @Test(timeout = 10)
    public void testSort_Performance() {
        int[] array = {12, 23, 4};
        for(int i=1; i <= 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
