package Lab1;

import java.util.ArrayList;

public class PersonalSystem {
    ArrayList<Employee> arrEmp = new ArrayList<Employee>();
    public void AddEmployee(Employee emp){
        arrEmp.add(emp);
    }
    public void RemoveEmployee(Employee emp){
        arrEmp.remove(emp);
    }

    public int RemoveEmp(int CID){
        for (int i = 0; i < arrEmp.size(); i++) {
            if(CID == arrEmp.get(i).getCompanyID()) {
                arrEmp.remove(i);
            }
        }
        return arrEmp.size();
    }
    public void IncrementAllEmployeeSal(int percent) {
        double sal ;
        for (int i = 0; i < arrEmp.size(); i++) {
          sal =   arrEmp.get(i).getSalary();
          sal = sal + (sal *percent)/100;
          arrEmp.get(i).setSalary(sal);
        }
    }
    public void IncrementEmpSal(int cmpnyID, int percent){
        double sal;
        for (int i = 0; i < arrEmp.size(); i++) {
            if(cmpnyID == arrEmp.get(i).getCompanyID()) {
                sal = arrEmp.get(i).getSalary();
                sal = sal + (sal * percent) / 100;
                arrEmp.get(i).setSalary(sal);
            }
        }
    }
}
