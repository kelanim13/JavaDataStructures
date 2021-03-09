import java.util.*; 

public class CarHash {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		HashMap<String, String> car = new HashMap<String, String>(); 
		
		car.put("Camry", "Toyota"); 
		car.put("Rogue", "Nissan"); 
		car.put("Santa Fe", "Hyundai"); 
		car.put("Accord", "Honda"); 
		car.put("Wrangler", "Jeep"); 
		
		String model = ""; 
	
		System.out.println("What car model are you looking for?");
		model = input.nextLine(); 
		
		if(car.containsKey(model)) {
			System.out.println("Oh, you're looking for a " + car.get(model) + " " + model + "?" + "\nOur " + car.get(model) + " selection is right over there :)"); 
		}
		else 
		{
			System.out.println("Sorry, but We do not have a " + model); 
		}
	}
}