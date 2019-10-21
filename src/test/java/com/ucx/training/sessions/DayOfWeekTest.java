package com.ucx.training.sessions;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfWeekTest{
    @Test
    public void dayOfWeek_correctAnswer()
    {
        byte day = 4;

        assertEquals("Thursday", DayOfWeek.convert(day));
    }

    @Test(expected = IllegalArgumentException.class)
    public void dayOfWeek_wrongAnswer(){
        byte day = 0;

        DayOfWeek.convert(day);
    }
}
