package com.ucx.training.sessions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This suite tests number of white spaces per given sentence, both with basic flow and alternative flows.
 */
public class WhiteSpaceTest {
    @Test
    public void testCountWhiteSpaces() {
        assertNotNull(MockData.getTestSentences()[0]);
        assertEquals(8, WhiteSpace.countWhiteSpaces(MockData.getTestSentences()[0]));
        assertEquals(2, WhiteSpace.countWhiteSpaces(MockData.getTestSentences()[1]));
        assertEquals(3, WhiteSpace.countWhiteSpaces(MockData.getTestSentences()[2]));
    }

    @Test
    public void testCountWhiteSpaces_whenSentenceIsNull(){
        assertEquals(-1, WhiteSpace.countWhiteSpaces(null));
    }

    @Test
    public void testCountWithWhiteSpaces_whenSentenceIsEmpty(){
        assertEquals(-1, WhiteSpace.countWhiteSpaces(""));
    }
}
