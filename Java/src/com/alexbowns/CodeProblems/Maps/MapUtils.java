package com.alexbowns.CodeProblems.Maps;

import java.util.*;

public class MapUtils {

    // We're given a hashmap associating each courseId key with a list of courseIds values,
    // which represents that the prerequisites of courseId are courseIds.
    // Return a sorted ordering of courses such that we can finish all courses.
    //
    // Return null if there is no such ordering.
    //
    // For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}
    // should return ['CSC100', 'CSC200', 'CSCS300'].
    public static List<String> sortCourseOrder(Map<String, List<String>> coursesAndPrerequesits)
    {
        List<String> sortedCourses = new ArrayList<>();
        boolean progress = true;
        while (progress)
        {
            progress = false;
            if (coursesAndPrerequesits.keySet() != null) {
                for (String key : coursesAndPrerequesits.keySet())
                {
                    List<String> vals = coursesAndPrerequesits.get(key);
                    if (vals == null || sortedCourses.containsAll(vals))
                    {
                        sortedCourses.add(key);
                        coursesAndPrerequesits.remove(key);
                        progress = true;
                    }
                }
            }
        }

        if (coursesAndPrerequesits.size() > 0)
        {
            return null;
        }
        else
        {
            return sortedCourses;
        }
    }
}
