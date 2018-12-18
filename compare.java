import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Compare {

	@Override
	public String toString() {
		return "Station = " + Station.getName() + " parking cost = " + Station.getParkingCost() + " trip cost = " + Station.getCostToUnionStation();
	}
	public static ArrayList<Station> listStations(){
		ArrayList<Station> stations = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\r?\n");
		System.out.println("Would you like to create a station? Y or N:");
		String create = keyboard.next();
		while (create.equals("Y")) {
			System.out.println("Enter name of station.");
			String name = keyboard.next();
			System.out.println("Enter parking cost.");
			Float park = keyboard.nextFloat();
			System.out.println("Enter ride cost.");
			Float ride = keyboard.nextFloat();
			Station unknown = new Station(name, park, ride);
			stations.add(unknown);
			System.out.print("Would you like to create another station? Y or N");
			create = keyboard.next();
		}
		return stations;
	
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Station> dcMetro = listStations();
		System.out.println(dcMetro.toString());
		}

}
