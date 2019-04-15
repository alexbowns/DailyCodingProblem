package com.alexbowns.Tests;

import com.alexbowns.CodeProblems.ArrayProblems;
import org.junit.Assert;
import org.junit.Test;

public class ArrayProblemsTest {

    @Test
    public void largestProductOfN() {
        int expected = 500;
        int[] arr = {-10, -10, 5, 2};
        try {
            int actual = ArrayProblems.largestProductOfN(arr, 3);
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
            int[] actual = ArrayProblems.getNLargest(arr, 2);
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
            int[] actual = ArrayProblems.getNSmallest(arr, 2);
            Assert.assertArrayEquals(expected, actual);
        } catch (Exception e) {
            Assert.fail(e.toString());
        }
    }
}
