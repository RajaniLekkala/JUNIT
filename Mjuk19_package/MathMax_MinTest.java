package Mjuk19_package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathMax_MinTest {
    @Test
    public void testMaxMin(){
        int a = 5, b= 6;
        int max = 6;
        int min = 5;
        assertEquals(max, Math.max(a,b));
        assertEquals(min, Math.min(a,b));

    }

}