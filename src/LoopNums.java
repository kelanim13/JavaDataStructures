import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoopNums {

	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();

		 for (int i = 0; i < 5; i++) 
		 
        {
			System.out.print("Enter a number: ");
			Integer value = Integer.parseInt(input.nextLine()); 
			list.add(value); 	
        }
		System.out.print(list);
		
		System.out.println("\nSum of list: " + sum(list)); 
		
		System.out.println("\npoduct of list: " + product(list));
		
		//System.out.println("smallest number is: " + Collections.min(list));   *shortcut 
		
		//System.out.println("largest number is: " + Collections.max(list)); 	*shortcut
		
		int min = list.get(0); 
		int max = list.get(0); 
		
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i) >= max) {
				max = list.get(i); 
			}
		}
		
		for (int i = 0; i < list.size(); i++)
		{
			if(list.get(i) <= min) {
				min = list.get(i); 
			}
		}
		
		System.out.println("the largest number is " + max); 
		System.out.println("the smallest number is " + min); 
		
	}
		
	
	public static int sum(ArrayList<Integer>list) {
		int sum = 0; 
		for (int i = 0; i < list.size(); i++)
		{
			sum += list.get(i); 
		}
		return sum; 
	}
	
	public static int product(ArrayList<Integer>list) {
		int product = 1; 
		
		for (int i = 0; i < list.size(); i++)
		{
			product *= list.get(i); 
		}			
		return product;
	}
	
	
}	