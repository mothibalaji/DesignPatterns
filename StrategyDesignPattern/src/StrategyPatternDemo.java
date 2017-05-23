import java.util.Scanner;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		System.out.println("Enter Travel Type to Airport");
		Scanner cn=new Scanner(System.in);
		String type=cn.next();
		TravelContext travel=new TravelContext();
		
		if("Bus".equalsIgnoreCase(type)){
			travel.setTravelStrategy(new BusTravelStrategy());
		}else if("Taxi".equalsIgnoreCase(type)){
			travel.setTravelStrategy(new TaxiTravelStrategy());
		}else if("Train".equalsIgnoreCase(type)){
			travel.setTravelStrategy(new TrainTravelStrategy());
		}

		System.out.println("Travel:"+travel.getTravelStrategy());
		travel.travelToAirport();
	}

}
