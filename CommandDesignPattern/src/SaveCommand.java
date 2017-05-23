
public class SaveCommand implements Command {
	private WordDocument document;
	
	public SaveCommand(WordDocument word){
		this.document=word;
	}
	
	@Override
	public void execute(){
		document.save();
	}
}
