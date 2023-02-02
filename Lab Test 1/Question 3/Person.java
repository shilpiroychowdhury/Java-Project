//Creating Employee class  
class EmployeeDetails {  
	//Creating properties of Employee class  
int emp_id, salary, age, number;  
String name, address, department;  
  
//Getter and setters for getting and setting properties  
public int getEmp_id() {  
    return emp_id;  
}  
public void setEmp_id(int emp_id) {  
    this.emp_id = emp_id;  
}  
public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public int getAge() {  
    return age;  
}  
public void setage(int age) {  
    this.age = age;  
}  
public int getNumber() {  
    return number;  
}  
public void setNumber(int salary) {  
    this.number = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getAddress() {  
    return address;  
}  
public void setAddress(String address) {  
    this.address = address;  
}  
public String getDepartment() {  
    return department;  
}  
public void setDepartment(String department) {  
    this.department = department;  
}  

//Overriding toString() method  
@Override  
public String toString() {  
    return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", age = " + age + ",number = "+ number +" , name = " + name + ", address = " + address  
            + ", department = " + department + "]";  
    }  
      
}  