package com.ucx.training.sessions;

import org.junit.Test;

import static org.junit.Assert.*;

public class TotalSumTest {
    @Test
    public void totalSum_isCorrect(){
        int testSum = 15;
        assertEquals(120, TotalSum.sumUpTo(testSum));
    }

    @Test(expected = IllegalArgumentException.class)
    public void totalSum_startFrom0(){
        int testSum = 0;
        TotalSum.sumUpTo(testSum);
    }
}
