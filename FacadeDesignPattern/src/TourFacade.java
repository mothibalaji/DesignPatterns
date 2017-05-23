
public class TourFacade {
	private TourPackage flight;
	private TourPackage car;
	private TourPackage hotel;
	public TourFacade(){
		System.out.println("Inside");
		flight=new Flight();
		car=new Car();
		hotel=new Hotel();
		
	}
	
	public void bookTourPackage(){
		flight.booking();
		car.booking();
		hotel.booking();
	}
}
