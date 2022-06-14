package Array;

import java.util.Scanner;
import java.util.TreeSet;

public class UniqueElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		
		int size = sc.nextInt();
		
		System.out.println("Enter elements of Array  :");
		
		int[] arr = new int[size];
		
		//using a set to store unique elements from array
		TreeSet<Integer> ts = new TreeSet<>();
		
		for(int i = 0 ; i < size; i++) {
			arr[i] = sc.nextInt();
			ts.add(arr[i]);
		}
		
		System.out.println(ts.size());
		sc.close();
	}

}
