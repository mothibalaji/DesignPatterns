
public class MenuOptions {
	private Command opencommand;
	private Command closecommand;
	private Command savecommand;
	
	public MenuOptions(Command open,Command close,Command save){
		this.opencommand=open;
		this.closecommand=close;
		this.savecommand=save;
	}
	
	public void clickOpen(){
		opencommand.execute();
	}
	public void clickSave(){
		savecommand.execute();
	}
	public void clickClose(){
		closecommand.execute();
	}
}
