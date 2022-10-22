package practise.pgms;

class Rectangle
{
	int length,width;
	void getValues(int length,int width)
	{
		this.length=length;
		this.width=width;
		
	}
	void areaOfRectangle() {
		System.out.println("Area of Rectangle is "+length*width);
	}
	}
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		r.getValues(20, 25);
		
		r.areaOfRectangle();
	}

}

