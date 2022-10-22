package practise.pgms;

import java.util.List;
import java.util.Vector;

public class ExampleEnumeration {

	public static void main(String[] args) {
		List<Integer> vl=new Vector<Integer>();
		
		for(int i=1;i<=10;i++) {
			vl.add(i);
		}
		System.out.println(vl);
	}

}
