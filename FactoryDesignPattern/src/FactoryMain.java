
public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS os=osf.getInstance("Mac");
		os.specs();

		os=osf.getInstance("Open");
		os.specs();
		
		os=osf.getInstance("Windows");
		os.specs();
	}

}
