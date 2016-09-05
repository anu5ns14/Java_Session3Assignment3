import java.util.Scanner;

public class ReverseOfAnArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		//Initialising an array
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+(i+1)+" element into an array: ");
			arr[i]= scan.nextInt();
		}
		
		//Printing an array
		System.out.println();
		System.out.println("************************************");	
		System.out.println("");
		System.out.println("Values in the array are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
			
		}
		System.out.println();
		System.out.println("************************************");	
		System.out.println("");
		System.out.println("Reverse of an array ");
		//Reverse of an array
		for (int i = size-1; i >= 0; i--) {
			
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
}
