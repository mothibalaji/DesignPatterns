
public class TravelContext {

	private TravelStrategy travelStrategy;
	
	public void setTravelStrategy(TravelStrategy strategy){
		this.travelStrategy=strategy;
	}
	public TravelStrategy getTravelStrategy(){
		return travelStrategy;
	}
	
	public void travelToAirport(){
		travelStrategy.travelToAirport();
	}
}
