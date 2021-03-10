import java.util.*;

public class CarHash {

	public static void main(String[] args) {

		HashMap<String, String> car = new HashMap<String, String>();

		car.put("Camry", "Toyota");
		car.put("Rogue", "Nissan");
		car.put("Santa Fe", "Hyundai");
		car.put("Accord", "Honda");
		car.put("Wrangler", "Jeep");
		
		Scanner input = new Scanner(System.in);
		System.out.println("What car model are you looking for?");
		String model = input.nextLine();
		model = model.toLowerCase(); 

		

		if (car.containsKey(model)) {
			
			String make = car.get(model); 
			
			System.out.println("Oh, you're looking for a " + model); 
			System.out.println("Our " + make + " selection is right over there :)");
		} else {
			System.out.println("Sorry, but we do not have that maodel");
		}

		
		// different approach

		System.out.println("What car make are you looking for?");
		String carMake = input.nextLine();

		switch (carMake) {

		case "Toyota":
			System.out.println("Our Toyota camry selection is right over there :)");
			break;

		case "Nissan":
			System.out.println("Our Nissan Rogue selection is right over there :)");
			break;

		case "Hyundai":
			System.out.println("Our Hyundai Santa Fe selection is right over there :)");
			break;

		case "Honda":
			System.out.println("Our Honda Accord selection is right over there :)");
			break;

		case "Jeep":
			System.out.println("Our Jeep Wrangler selection is right over there :)");
			break;

		default:
			System.out.println("Sorry we do not have that make in store :(");
			break;
		}
	}
}