import java.util.ArrayList;

import Commands.Command;

public class Invoker {
	Command theCommand;
	static ArrayList<Command> commandHistory = new ArrayList<Command>();
	 
	public Invoker (Command newCommand){
		theCommand = newCommand;
		commandHistory.add(theCommand);
	}
	
	public void activate()
	{
		theCommand.execute();
	}
	
	public void undo()
	{
		theCommand.undo();
	}
}
