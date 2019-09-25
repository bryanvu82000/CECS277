package ipi;

import java.util.Arrays;
/**
 * 
 * @author william Gusmanov, Bryan Vu 
 * 
 */
public class GeometricObjectRunner {

	public static void main(String[] args) {
		GeometricObject [] testArray = new GeometricObject[3];
		
		Rectangle one = new Rectangle (50,50,1,1);
		Triangle two = new Triangle (0,0,10,0,0,10);
		Circle three = new Circle (0,0,15);
		
		testArray[0] = one;
		testArray[1] = two;
		testArray[2] = three;
		
		//unsorted array 
		for (int i = 0; i < testArray.length; i++) {
			System.out.println("i: "+ i + "\n"+ "to String: " + testArray[i]);
		}
		
		Arrays.parallelSort(testArray);
		
		//sorted array 
		System.out.println("\nprinting sorted array:");
		for (int i = 0; i < testArray.length; i++) {
			System.out.println(i + "\n"+ testArray[i]);
		}
	}
}
