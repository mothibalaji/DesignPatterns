
public class OpenCommand implements Command {
	private WordDocument document;
	
	public OpenCommand(WordDocument word){
		this.document=word;
	}
	
	@Override
	public void execute(){
		document.open();
	}
}
