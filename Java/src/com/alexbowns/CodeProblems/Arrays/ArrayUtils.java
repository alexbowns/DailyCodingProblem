package com.alexbowns.CodeProblems.Arrays;

import java.util.Arrays;

public class ArrayUtils {

    public static int largestProductOfN(int[] values, int n) throws Exception
    {
        if (values == null || values.length < n)
            throw new Exception("Array Size is null or too small.");

        int[] nSmallest = getNSmallest(values, n-1);
        int[] nLargest = getNLargest(values, n);

        int smallProduct = product(nSmallest) * nLargest[nLargest.length-1];
        int largeProduct = product(nLargest);

        if (smallProduct > largeProduct)
            return smallProduct;
        else
            return largeProduct;
    }

    public static int[] getNLargest(int[] values, int n) throws Exception
    {
        if (values == null || values.length < n)
            throw new Exception("values is null or too small.");

        Arrays.sort(values);
        return Arrays.copyOfRange(values, values.length-n, values.length);
    }

    public static int[] getNSmallest(int[] values, int n) throws Exception
    {
        if (values == null || values.length < n)
            throw new Exception("values is null or too small.");

        Arrays.sort(values);
        return Arrays.copyOfRange(values, 0, n);
    }

    private static int product(int[] values) throws Exception
    {
        if (values == null || values.length < 1)
            throw new Exception("values is null or empty.");

        int product = 1;
        for (int i : values)
        {
            product *= i;
        }
        return product;
    }


}
