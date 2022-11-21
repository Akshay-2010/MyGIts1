import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("bhai");
		al.add("aai");
		
			
		
		
		
		HashSet hs = new HashSet(al);
		
		hs.add(12);
		hs.add(13);
		hs.add("akshay");
		
		hs.add("sunil");
		
		hs.remove(12);
		System.out.println(hs.contains("piyush"));
		
		System.out.println(hs);
		
		
		

	}

}
