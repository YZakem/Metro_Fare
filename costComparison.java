import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CostComparison {

	private ArrayList<Station> stations;
	
	/**
	 * Takes user input to create an Array of stations in an instance of CostComparison.stations
	 */
	public void inputStations(){
		this.stations = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\r?\n");
		System.out.println("Would you like to create a station? Y or N:");
		String create = keyboard.next();
		while (create.toUpperCase().equals("Y")) {
			System.out.println("Enter name of station.");
			String name = keyboard.next();
			System.out.println("Enter parking cost.");
			Float park = keyboard.nextFloat();
			System.out.println("Enter ride cost.");
			Float ride = keyboard.nextFloat();
			Station station = new Station(name, park, ride);
			this.stations.add(station);
			System.out.print("Would you like to create another station? Y or N");
			create = keyboard.next();
		}		
	}

	/**
	 * Calculates total cost of each station and associates with station name in hashmap
	 * @param stations
	 */
	public HashMap<String, Double> calculateTotalCost(ArrayList<Station> stations){
		HashMap<String, Double> totalCosts = new HashMap<>();
		for (Station station : this.stations) {
			station.rideCost(true);
			totalCosts.put(station.getName(), station.rideCost(true));
		}
		return totalCosts;
	}

	public static void main(String[] args) {
		CostComparison comparison = new CostComparison();
		comparison.inputStations();	//populates comparison with stations
		System.out.println(comparison);
		comparison.calculateTotalCost(comparison.stations);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("There are " + this.stations.size() + " stations being compared.\n");
		for (Station station : this.stations) {
			builder.append(station + "\n");
		}
		return builder.toString();
	}
}
