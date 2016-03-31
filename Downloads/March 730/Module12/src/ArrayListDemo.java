import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>(); //Or
		List<String> list = new ArrayList<String>();
		System.out.println(list.size()); 
		list.add("India");
		System.out.println(list.size());
		list.add("Uk");
		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
