package com.alexbowns.CodeProblems.Boards;

public class BoardProblems {

    public static int minStepsToTravel(Coordinate[] coordinates) throws InvalidCoordinatesException
    {
        if (coordinates == null || coordinates.length < 2)
        {
            throw new InvalidCoordinatesException("Size is null or less than 2");
        }

        int totalSteps = 0;
        for (int i = 1; i < coordinates.length; i++)
        {
            totalSteps += distanceBetweenCoordinates(coordinates[i-1], coordinates[i]);
        }
        return totalSteps;
    }

    private static int distanceBetweenCoordinates(Coordinate coordinate1, Coordinate coordinate2)
    {
        return Math.max(Math.abs(coordinate1.x - coordinate2.x), Math.abs(coordinate1.y - coordinate2.y));
    }


}
