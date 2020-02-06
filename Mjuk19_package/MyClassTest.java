package Mjuk19_package;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    MyClass mc = new MyClass();
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Testing starts..");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Testing is done..");
    }
    @BeforeEach
    public  void beforeEach(TestInfo info){
        System.out.println("Current test: " + info.getDisplayName());
     }
    @AfterEach
    public  void afterEach(TestInfo info){
        System.out.println("Current test finished: " + info.getDisplayName());
    }

    @Test
    @DisplayName("Testing the length of a string")
    public void length_test(){
        String testString = "Hej";
        int a =3;//expected
        int b = testString.length();//actual
        assertEquals(a, b);
    }
    @Test
    @DisplayName("Testing the isEmpty function")
    public void isEmpty_test(){
        String str = "";
        boolean res = str.isEmpty();
        assertTrue(res);
    }
    @Test
    @DisplayName("Testing the string contains function value with different assert functions")
    public void stringContains(){
        String str = "rajani";
        boolean resTrue = str.contains("aja");
        assertTrue(resTrue);
        boolean resFalse = str.contains("aji");
        assertFalse(resFalse);
        assertEquals(false,resFalse);
        assertEquals(true, resTrue);
       //   assertNull(str);
        assertNotNull(str);
    }

    @ParameterizedTest
    @DisplayName("Tests the negative method")
    @ValueSource(ints = {5,10,15,20,200,1390})
    void negative_test(int val){
        assertTrue(mc.negative(val) < 0);
    }

    @ParameterizedTest(name="{0} negativt är: {1}")
    @DisplayName("Tests the negative method with the given values ")
    @CsvSource(value = {"5, -5","12, -12","20, -20","-50, 50"})
    void negative_test1(int expected, int actual){
        assertEquals(expected,mc.negative(actual));
    }

    @ParameterizedTest
    @DisplayName("Tests the stringLength greater than 0")
    @ValueSource(strings  = {"a","ab","abc","abcd","abcdef"})
    void checkStringLength(String strVal){
        assertTrue(strVal.length() > 0);
    }
}