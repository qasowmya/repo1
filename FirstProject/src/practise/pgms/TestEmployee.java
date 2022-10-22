package practise.pgms;
//object intialization through methods
class Employee1
{
	int id,salary;
	String name;
	void insertDetails(int i,int s,String n)
	{
		id=i;
		salary=s;
		name=n;
	}
	void display() {
		System.out.println(id+" "+salary+" "+name);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		e1.insertDetails(1, 10000, "rohan");
		Employee1 e2=new Employee1();
		e2.insertDetails(2, 10000, "sresta");
		Employee1 e3=new Employee1();
		e3.insertDetails(3, 10000, "sradda");
		e1.display();
		e2.display();
		e3.display();

	}

}
