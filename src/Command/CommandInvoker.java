package Shape;

import java.util.ArrayList;

import Command.Command;

public class CommandInvoker {
	Command theCommand;
	static ArrayList<Command> commandHistory = new ArrayList<Command>();

	public CommandInvoker (Command newCommand){
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
