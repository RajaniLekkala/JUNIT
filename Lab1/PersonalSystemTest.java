package Lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class PersonalSystemTest {
    PersonalSystem ps = new PersonalSystem();
    @Mock
    Employee emp1;
    Employee emp2;
    Employee emp3;
    @Test
    @DisplayName("Testing by adding and removing the employees from list")
    public void testAddRemoveEmployeesByMock(){
        ps.AddEmployee(emp1);
        ps.AddEmployee(emp2);
        ps.AddEmployee(emp3);
        assertEquals(3,ps.arrEmp.size());
        ps.RemoveEmployee(emp3);
        assertEquals(2,ps.arrEmp.size());
    }

   @Test
    public void testAddRemoveEmployees(){
        Employee employee = new Employee("Rajani","Lekkala",32,32000);
        ps.AddEmployee(employee);
        Employee employee1 = new Employee("Radhika","Ch",33,35000);
        ps.AddEmployee(employee1);
        Employee employee2 = new Employee("Saradha","Arabelli",33,35000);
        ps.AddEmployee(employee2);
        Employee employee3 = new Employee("Dhanya","Babu",30,33000);
        ps.AddEmployee(employee3);
        Employee employee4 = new Employee("Bhagya","Raghu",33,35000);
        ps.AddEmployee(employee4);

        int size = ps.arrEmp.size();
        ps.RemoveEmployee(employee1);
        assertEquals(size - 1,ps.arrEmp.size());

       // assertEquals(5,ps.arrEmp.size());



    }
    @Test
    public void AddEmp(){
        Employee employee = new Employee("Rajani","Lekkala",32,32000);
        ps.AddEmployee(employee);
        Employee employee1 = new Employee("Radhika","Ch",33,35000);
        ps.AddEmployee(employee1);
        Employee employee2 = new Employee("Saradha","Arabelli",33,35000);
        ps.AddEmployee(employee2);
        Employee employee3 = new Employee("Dhanya","Babu",30,33000);
        ps.AddEmployee(employee3);
        Employee employee4 = new Employee("Bhagya","Raghu",33,35000);
        ps.AddEmployee(employee4);

        assertEquals("Rajani",employee.getFirst_name());
        assertEquals("Lekkala",employee.getLast_name());
        assertTrue(employee.getAge()>30);
        assertFalse(employee.getSalary() < 3000);
    }
    @Test
    public void IncrementALlEmpSalary(){
        Employee employee = new Employee("Rajani","Lekkala",32,32000);
        ps.AddEmployee(employee);
        Employee employee1 = new Employee("Radhika","Ch",33,35000);
        ps.AddEmployee(employee1);
        Employee employee2 = new Employee("Saradha","Arabelli",33,35000);
        ps.AddEmployee(employee2);
        Employee employee3 = new Employee("Dhanya","Babu",30,33000);
        ps.AddEmployee(employee3);
        Employee employee4 = new Employee("Bhagya","Raghu",33,35000);
        ps.AddEmployee(employee4);

        ps.IncrementAllEmployeeSal(4);
        assertEquals(33280,ps.arrEmp.get(0).getSalary());
    }
    @Test
    public void IncrementEmpSalary(){
        Employee employee = new Employee("Rajani","Lekkala",32,32000);
        ps.AddEmployee(employee);
        Employee employee1 = new Employee("Radhika","Ch",33,35000);
        ps.AddEmployee(employee1);
        Employee employee2 = new Employee("Saradha","Arabelli",33,35000);
        ps.AddEmployee(employee2);
        Employee employee3 = new Employee("Dhanya","Babu",30,33000);
        ps.AddEmployee(employee3);
        Employee employee4 = new Employee("Bhagya","Raghu",33,35000);
        ps.AddEmployee(employee4);

        ps.IncrementEmpSal(1,6);
        assertEquals(33920, ps.arrEmp.get(0).getSalary());
    }
   /* @Test
    public void RemoveEmployee(){
        AddEmp();
        ps.RemoveEmp(4 );
        assertEquals(3, ps.RemoveEmp(5 ));

    }*/
}