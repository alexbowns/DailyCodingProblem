package com.alexbowns.Tests.Arrays;

import com.alexbowns.CodeProblems.Arrays.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {

    @Test
    public void largestProductOfN() {
        int expected = 500;
        int[] arr = {-10, -10, 5, 2};
        try {
            int actual = ArrayUtils.largestProductOfN(arr, 3);
            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }

    @Test
    public void getNLargest_two() {
        int[] expected = {2, 5};
        int[] arr = {-10, 5, -4, 2};
        try {
            int[] actual = ArrayUtils.getNLargest(arr, 2);
            Assert.assertArrayEquals(expected, actual);
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }


    @Test
    public void getNSmallest_two() {
        int[] expected = {-42, -10};
        int[] arr = {-10, -9, 5, -42, 42};
        try {
            int[] actual = ArrayUtils.getNSmallest(arr, 2);
            Assert.assertArrayEquals(expected, actual);
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }
}
