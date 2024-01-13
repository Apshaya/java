import java.util.Scanner;
public class goo {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       String std_name;
       char math_grade;
       float monthly_income;
       int Emp_age;
       double fcs_fee,cs_fee;     
       
       //input Student Name
       System.out.println("Enter Your Name :");
       std_name = input.next();
       
       //input mathematic grade
       System.out.println("Enter Your Ordinary Level Mathematics Grade:");
       math_grade = input.next().charAt(0);
       
        //input parents Salary
       System.out.println("Enter Your Parents Monthly Income");
       monthly_income = input.nextFloat();

        
        if(math_grade =='A' && monthly_income<40000)
            {
                cs_fee=60000;
                fcs_fee=cs_fee-(cs_fee*0.15);//calculate final course fee
                
            System.out.println(std_name);
            System.out.println(fcs_fee);//display
            }  
        else
            {
            System.out.println("You are not eligble for the discount"); //displayy   
            }
        
    }
}