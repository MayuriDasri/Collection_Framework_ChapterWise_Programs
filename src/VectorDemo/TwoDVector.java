package VectorDemo;

import java.util.Vector;

public class TwoDVector {

	public static void main(String[] args) {
		
		Vector<String> langVector = new Vector<String>();
		langVector.add("Java");
		langVector.add("Python");
		langVector.add("Ruby");
		langVector.add("C");
		langVector.add("C++");
		langVector.add("C#");
		
		System.out.println(" *************************** ");
		System.out.println(langVector);
		
		
		//Creating 2D Vector
		
		Vector<String> osVector = new Vector<String>();
		osVector.add("AAA");
		osVector.add("BBB");
		//osVector.addAll(langVector);
		osVector.addAll(1, langVector);
		
		System.out.println(osVector);
	}
}
