import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Builder.ShapeMachine;
import Builder.ShapePlan;
import Commands.ColorCommand;
import Commands.CreateCommand;
import Commands.DeleteCommand;
import Commands.DrawCommand;
import Commands.MoveCommand;
import Commands.Shape;

public class Test {
	private static ShapePlan shape;

	public static void main(String[] args) throws Exception{
		 ArrayList<ShapePlan> drawingList = new ArrayList<ShapePlan>();
		 Invoker i;
		 File file = new File("C:\\Users\\Bee-PC\\eclipse-workspace\\CS4773Assignment03\\src\\commandTest.txt");
		 BufferedReader br = new BufferedReader(new FileReader(file));

		String line;
		String [] parseCommand;
		while((line = br.readLine())!= null)
		{
			parseCommand = line.split(" ");

			switch(parseCommand[0])
			{
				case "CREATE": //todo: create needs to fix both circle and rectangle
					shape = ShapeMachine.getShape(parseCommand[1]);
					CreateCommand create = new CreateCommand(shape,Integer.parseInt(parseCommand[2]));
					drawingList.add(shape);
					i = new Invoker(create);
					i.activate();
					break;
				case "SELECT":
					// todo: error check the index
						shape = drawingList.get(Integer.parseInt(parseCommand[1]) -1);
					// todo: check for no values
					break;
				case "MOVE":
					MoveCommand move = new MoveCommand(shape,Integer.parseInt(parseCommand[1]), Integer.parseInt(parseCommand[2]));
					i = new Invoker(move);
					i.activate();
					break;
				case "DRAW":
					DrawCommand draw = new DrawCommand(shape);
					i = new Invoker(draw);
					i.activate();
					break;
				case "COLOR":
					// todo:[c] is one of the following valid colors:
					// Red, Blue, Yellow, Orange, Green
					ColorCommand color = new ColorCommand(shape,parseCommand[1]);
					i = new Invoker(color);
					i.activate();
					break;
				case "DELETE":
					DeleteCommand delete = new DeleteCommand(shape, drawingList);
					i = new Invoker(delete);
					i.activate();
					break;
			}
		}


	 }
}
