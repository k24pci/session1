package com.ucx.training.sessions;

import java.math.BigDecimal;

public class AddBigDecimals {
    public static void main(String[] args) {
        BigDecimal decimalOne = new BigDecimal(115);
        BigDecimal decimalTwo = new BigDecimal(15);

        System.out.println("The sum of " + decimalOne + " and " + decimalTwo + " " + " is " + sum(decimalOne, decimalTwo));
    }

    public static BigDecimal sum(BigDecimal value1, BigDecimal value2){

        if (value1.compareTo(BigDecimal.ZERO) < 1 || value2.compareTo(BigDecimal.ZERO) < 1){
            throw new IllegalArgumentException("value1 and value2 should not be 0 or negative numbers!");
        }

        return value1.add(value2);
    }
}
