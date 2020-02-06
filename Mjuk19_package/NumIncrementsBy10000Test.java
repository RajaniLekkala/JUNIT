package Mjuk19_package;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumIncrementsBy10000Test {

    NumIncrementsBy10000 ni = new NumIncrementsBy10000();

    @ParameterizedTest(name="{0} increments by 10,000 är: {1}")
    @DisplayName("Tests the NumIncrementsBy10000 with set of values")
    @CsvSource(value = {"2, 20000","4, 40000","20, 200000","50, 500000"})
    void checkSetValues(int expected, int actual)
    {
       assertEquals(expected,ni.getNumber(actual));
    }

    @Test
    @DisplayName("Tests by random values")
    void checkRandomValues(){
        double randomDouble = Math.random();
        randomDouble = randomDouble * 101 ;
        int randomValue = (int) randomDouble;
        int actual = randomValue * 10000;
        assertEquals(randomValue, ni.getNumber(actual) );
    }

}