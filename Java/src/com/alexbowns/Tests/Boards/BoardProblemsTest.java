package com.alexbowns.Tests.Boards;

import com.alexbowns.CodeProblems.Boards.BoardProblems;
import com.alexbowns.CodeProblems.Boards.Coordinate;
import com.alexbowns.CodeProblems.Boards.InvalidCoordinatesException;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardProblemsTest {

    @Test
    public void minStepsToTravel() {
        Coordinate[] fakeCoordinateSequence =  {new Coordinate(0, 0), new Coordinate(1, 1), new Coordinate(1, 2)};
        int expected = 2;
        try{
            int actual = BoardProblems.minStepsToTravel(fakeCoordinateSequence);
            assertEquals(expected, actual);
        }
        catch (InvalidCoordinatesException e)
        {
            fail(e.getMessage());
        }

    }
}