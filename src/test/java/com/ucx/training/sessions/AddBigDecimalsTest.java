package com.ucx.training.sessions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AddBigDecimalsTest {
    @Test
    public void bigDecimalSum_isCorrect(){
        BigDecimal testOne = new BigDecimal(115);
        BigDecimal testTwo = new BigDecimal(15);

        assertEquals(new BigDecimal(130), AddBigDecimals.sum(testOne, testTwo));
    }

    @Test(expected = IllegalArgumentException.class)
    public void bigDecimalSum_startFrom0(){
        BigDecimal testOne = new BigDecimal(0);
        BigDecimal testTwo = new BigDecimal(-1);

        AddBigDecimals.sum(testOne, testTwo);
    }
}
