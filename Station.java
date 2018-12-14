public class Station {

	final private double parkingCost;
	final private double costToUnionStation;
	final private String name;
	
	public String getName() {
	return this.name;
	}

	public Station(String name, double parkingCost, double costToUnionStation) {
		this.name = name;
		if (parkingCost < 0) {
			throw new IllegalArgumentException("You don't get paid to park!");
		}
		this.parkingCost = parkingCost;
		if (costToUnionStation< 0) {
			throw new IllegalArgumentException("You don't get paid to go to Union Station!");
		}
		this.costToUnionStation = costToUnionStation;
	}
	
	public double rideCost(boolean roundTrip) {
		double total;
		if (roundTrip) {
			total = this.costToUnionStation * 2 + this.parkingCost;
		}
		else {
			total = this.costToUnionStation + this.parkingCost;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		Station forestGlen = new Station("Forest Glen", 3.30, 4.45);
		System.out.println("The cost from " + forestGlen.name + " is $" + forestGlen.rideCost(true));

	}

}
