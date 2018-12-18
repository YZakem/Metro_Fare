import java.util.ArrayList;
import java.util.Scanner;

public class CostComparison {

	private ArrayList<Station> stations;
	
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

	public static void main(String[] args) {
		CostComparison comparison = new CostComparison();
		comparison.inputStations();
			System.out.println(comparison);
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
