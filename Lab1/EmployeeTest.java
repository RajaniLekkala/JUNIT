package Lab1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

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
    @DisplayName("Testing the employee details by retrieving the data")
    public void testEmp(){
        Employee emp = new Employee("Rajani", "Lekkala",32,32000);
        assertEquals(32000,emp.getSalary());
        assertEquals("Rajani",emp.getFirst_name());
        assertEquals("Lekkala",emp.getLast_name());
        assertTrue(emp.getAge() > 30);
        assertFalse(emp.getSalary() < 25000);
    }
}