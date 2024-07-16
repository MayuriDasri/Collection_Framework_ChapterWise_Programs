package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Mayuri");
		studentList.add("Dasri");
		studentList.add("Shyam");
		studentList.add("Dasri");
		studentList.add("Kirtana");
		
		System.out.println("********************" + "\n ");
		//Typical For Loop
		for(int i = 0 ;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i));
		}
		
		System.out.println("********************" + "\n ");
		//ForEach loop
		for(String s : studentList)
		{
			System.out.println(s);
		}
		
		System.out.println("********************" + "\n ");
		//streams with lambda allowed in only java 1.8 onwards  
		studentList.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("********************" + "\n ");
		//Using Iterator
		Iterator<String> itr = studentList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
