//Creating main class  
public class Employee{  
    //main() method start  
    public static void main(String args[]) {  
          
        //Creating object of EmployeeDetails class  
        EmployeeDetails emp = new EmployeeDetails();  
        //Setting values to the properties  
        emp.setEmp_id(1);  
        emp.setName("Shilpi Roy Chowdhury"); 
        emp.setAge(24);  
        emp.setNumber(863708625);  
        emp.setDepartment("IT");  
        emp.setSalary(10000);  
        emp.setAddress("Kolkata");  
          
        //Showing Employee details  
        System.out.println(emp);  
          
    }
}