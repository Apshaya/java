import java.util.Scanner;
public class lab {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
    //User Data
       String Emp_ID;
       String Emp_name;
       float Emp_salary;
       int Emp_age;    
       
    //User input of the Employee ID
       System.out.println("Input Employee ID: ");
       Emp_ID = input.next();
       
    //User input of the Employee Name
       System.out.println("Input Employee Name: ");
       Emp_name = input.next();
       
    //User input of the Employee Salary
       System.out.println("Input Employee Salary: ");
       Emp_salary = input.nextFloat();
       
    //User input of the Employee age
       System.out.println("Input Employee age: ");
       Emp_age = input.nextInt();

    //User Emp_ID and Emp_name
       System.out.println("Employee ID: "+(Emp_ID)); 
       System.out.println("Employee Name: "+(Emp_name)); 
        
        if(Emp_age >30){
            System.out.println("You're eligible for allowance");
            System.out.println("Your allowence is: "+ (Emp_salary*0.07));
            System.out.println("Your final salary is: " + (Emp_salary+Emp_salary*0.07));
        }  
        else{
            System.out.println("Sorry, You are not eligble!!!");    
        }        
    }
}