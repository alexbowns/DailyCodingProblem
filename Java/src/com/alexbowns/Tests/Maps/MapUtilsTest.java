package com.alexbowns.Tests.Maps;

import com.alexbowns.CodeProblems.Maps.MapUtils;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MapUtilsTest {

    @Test
    public void sortCourseOrder() {
        Map<String, List<String>> stubCourseMap = new HashMap<String, List<String>>();
        stubCourseMap.put("CSC300", Arrays.asList("CSC100", "CSC200"));
        stubCourseMap.put("CSC200", Arrays.asList("CSC100"));
        stubCourseMap.put("CSC100", null);
        List<String> expected = Arrays.asList("CSC100", "CSC200", "CSC300");
        List<String> actual = MapUtils.sortCourseOrder(stubCourseMap);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void sortCourseOrder_NoSolution() {
        Map<String, List<String>> stubCourseMap = new HashMap<String, List<String>>();
        stubCourseMap.put("CSC300", Arrays.asList("CSC100", "CSC500"));
        stubCourseMap.put("CSC200", Arrays.asList("CSC100"));
        stubCourseMap.put("CSC100", null);
        List<String> actual = MapUtils.sortCourseOrder(stubCourseMap);
        assertNull( actual);
    }
}