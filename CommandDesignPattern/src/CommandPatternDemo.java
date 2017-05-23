
public class CommandPatternDemo {

	public static void main(String[] args) {
		WordDocument wordDoc=new WordDocument();
		Command openCommand=new OpenCommand(wordDoc);
		Command saveCommand=new SaveCommand(wordDoc);
		Command closeCommand=new CloseCommand(wordDoc);
		
		MenuOptions menu=new MenuOptions(openCommand,closeCommand,saveCommand);
		
		menu.clickOpen();
		menu.clickSave();
		menu.clickClose();
		

	}

}
