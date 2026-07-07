package Collection;

import static java.lang.System.*;
import java.util.HashMap;

public class Hash_Map {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// 1. Create a HashMap (Key: String, Value: Integer)
		HashMap<String, Integer> Car = new HashMap<>();

		// 2. Add elements (Key-Value pairs)
		Car.put("Skoda", 53000000);
		Car.put("Toyota", 10000000);
		Car.put("Mahindra", 3500000);

		// 3. Access a value using its key
		int car_price = Car.get("Skoda");
		out.println("Car Price shows: " + car_price); 

		// 4. Check if a key exists
		if (Car.containsKey("Mahindra")) {
			out.println("Mahindra is available.");
		}

		// 5. Remove an element
		Car.remove("Skoda");

		// 6. Iterate through the HashMap
		out.println("\n--- Current Inventory ---");
		for (String carName : Car.keySet()) {
			out.println(carName + ": " + Car.get(carName));
		}
	}
}
