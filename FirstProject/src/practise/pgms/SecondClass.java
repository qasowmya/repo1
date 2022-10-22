package practise.pgms;

//import java.io.FileInputStream;

class SecondClass
{
	public static void main(String[] args)throws Exception 
	{
		Employee e=new Employee();
		System.out.println(e.id);
		System.out.println(e.name);
		
		System.out.println("hello");
	//	FileInputStream  i=new FileInputStream("");
		
	}

}

 class Employee
{
	int id=12;
	String name;
}