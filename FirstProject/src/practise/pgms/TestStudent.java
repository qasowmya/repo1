package practise.pgms;

class Student
{
	int id;
	String name;
}
//object intialization through variables
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student();
		s.id=121;
		s.name="Rohan";
		s1.id=131;
		s1.name="sresta";
		System.out.println(s.id+" "+s.name);
		System.out.println(s1.id+" "+s1.name);
	}

}
