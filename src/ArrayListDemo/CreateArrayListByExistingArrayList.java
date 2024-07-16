package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayListByExistingArrayList {

	public static void main(String[] args) {
		
		//creating arraylist by passing values in constructor
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(marks);

		
		//creating arraylist by passing another arraylist
		System.out.println("********************" + "\n ");
		ArrayList<Integer> rollno = new ArrayList<Integer>();
		rollno.addAll(marks);
		System.out.println(rollno);
		
		//creating arrayList by passing another arraylist with index values 
		System.out.println("********************" + "\n ");
		ArrayList<Integer> serialno = new ArrayList<Integer>();
		serialno.add(500);
		serialno.add(600);
		serialno.add(700);
		serialno.add(800);
		System.out.println("Before adding another list : "+ serialno);
		serialno.addAll(2, marks);//here we can add another list at any index
		System.out.println("After adding marks list to serial no list :" + serialno);
		
		
		
	}

}
