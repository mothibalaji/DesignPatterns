
public class CloseCommand implements Command {
	private WordDocument document;
	
	public CloseCommand(WordDocument word){
		this.document=word;
	}
	
	@Override
	public void execute(){
		document.close();
	}
}
