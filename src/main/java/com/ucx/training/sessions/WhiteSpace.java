package com.ucx.training.sessions;

public class WhiteSpace
{
    private static final char WHITE_SPACE = ' ';

    /**
     * This method counts number of white spaces for given sentence
     * @param sentence
     * @return
     */
    public static int countWhiteSpaces(String sentence) {

        int whiteSpaceCounter = 0;

        if (sentence == null || sentence.isEmpty()) {
            return -1;
        }

        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) == WHITE_SPACE) {
                whiteSpaceCounter++;
            }
        }

        return whiteSpaceCounter;
    }

}
