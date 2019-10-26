package Command;

import java.util.ArrayList;

public class CommandInvoker {
	Command currentCommand;
	static ArrayList<Command> commandHistory = new ArrayList<Command>();

	public CommandInvoker (Command newCommand){
		currentCommand = newCommand;
		commandHistory.add(currentCommand);
	}

	public void activate()
	{
		currentCommand.execute();
	}

	public void undo()
	{
		currentCommand.undo();
	}
}
