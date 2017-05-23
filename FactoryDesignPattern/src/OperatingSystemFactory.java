
public class OperatingSystemFactory {

	public OS getInstance(String OStype){
		if(OStype.equals("Open")){
			return new Android();
		}
		else if(OStype.equals("Windows")){
			return new Windows();
		}
		else if(OStype.equals("Mac")){
			return new IOS();
		}
		return null;
	}
}
