package com.ucx.training.sessions;

import org.junit.Test;
import static org.junit.Assert.*;

public class FilterNamesTest {

    @Test
    public void testFilter_basicFlow(){
        String[] filteredName = FilterNames.filter(MockData.getNames(), "A");
        assertEquals(filteredName[0], "agon");
        assertEquals(filteredName[1], "Arta");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilter_whenKeywordInvalid(){
       FilterNames.filter(MockData.getNames(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilter_whenNamesInvalid()
    {
        FilterNames.filter(null, "A");
    }
}
