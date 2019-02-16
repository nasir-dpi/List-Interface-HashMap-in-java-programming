
import java.util.HashMap;
import java.util.Map;

public class StartPoint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer ,String> a = new  HashMap<Integer, String>();
		a.put(10, "something");
		a.put(5, "man");
//		System.out.println(a);
//		System.out.println(a.get(5));
//		
		for(Map.Entry<Integer,String> i : a.entrySet())
			System.out.println(i.getKey() +" "+i.getValue());
		
//		System.out.println(a.size());
//		System.out.println(a.entrySet());

	
	}

}
