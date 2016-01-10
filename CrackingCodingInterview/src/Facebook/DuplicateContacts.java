package Facebook;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateContacts 
{
	public static void main(String[] args)
	{
		ArrayList<ArrayList<String>> out=new ArrayList<>();
		ArrayList<String> in=new ArrayList<>();
		in.add("john");
		in.add("john@gmail.com");
		in.add("+234");
		out.add(in);
		ArrayList<String> in1=new ArrayList<>();
		in.add("dan");
		in.add("dan@gmail.com");
		in.add("+567");
		out.add(in1);
		ArrayList<String> in3=new ArrayList<>();
		in.add("john123");
		in.add("john@gmail.com");
		in.add("+5671");
		out.add(in3);
		duplicates(out);
		
		
		
		
	}
	public static void duplicates(ArrayList<ArrayList<String>> lst)
	{
		HashMap<ArrayList<String>,Integer> map =new HashMap<>();
		int i=0;
		for(ArrayList<String> s:lst)
		{
			map.put(s,i++);
		}
		System.out.println(map);
		
	}

}
