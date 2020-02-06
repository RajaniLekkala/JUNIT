package Lab1;

public class Employee {
private String first_name;
private String last_name;
private int age;
private int companyID = 0;
private double salary;

    public Employee(String fname, String lname, int emp_age,int sal){
        first_name = fname;
        last_name = lname;
        age= emp_age;
        salary= sal;
        companyID =+1;
    }

public String getFirst_name(){
  return  this.first_name;
}
public void setFirst_name(String fname){
    this.first_name = fname;
}
public String getLast_name(){
    return this.last_name;
}
public void setLast_name(String lname){
    this.last_name = lname;
}
 public int getAge(){
    return this.age;
 }
 public void setAge(int empAge){
    this.age= empAge;
 }
 public int getCompanyID(){
    return this.companyID;
 }
 /*public void setCompanyID(int CID){
    this.companyID = CID;
 }*/
 public double getSalary(){
   return this.salary;
 }
 public void setSalary(double sal){
    this.salary = sal;
 }
}
