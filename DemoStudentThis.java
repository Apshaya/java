class Student
{  
	int regNo;  
	String name;  
	double fee;
	
	Student(int regNo,String name,double fee)
	{  
		this.regNo=regNo;  
		this.name=name;  
		this.fee=fee;
	}
	
	void display()
	{
		System.out.println("\nRegistration No:"+regNo+"\nStudent Name :"+name+"\nFee :"+fee);
	}  
}
  
class DemoStudentThis
{  
	public static void main(String args[]){  
		Student s1=new Student(70460940,"Tharangani",59623.00);  
		Student s2=new Student(70460941,"Neil",75420.00);  
		s1.display();  
		s2.display();  
	}
} 