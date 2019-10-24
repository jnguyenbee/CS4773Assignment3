import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Commands.CreateCommand;
import Commands.DeleteCommand;
import Commands.DrawCommand;
import Commands.MoveCommand;
import Commands.Shape;

public class Test {
	private static Shape shape;

	public static void main(String[] args) throws Exception{
		 ArrayList<Shape> drawingList = new ArrayList<Shape>();
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
					System.out.println(line);
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
					System.out.println(line);
					break;
				case "DELETE":
					DeleteCommand delete = new DeleteCommand(shape, drawingList);
					i = new Invoker(delete);
					i.activate();
					break;
			}
		}
	
	/*	 
		 Shape newShape = new Circle();
		 Shape newShape2 = new Circle();
		 drawingList.add(newShape);
		 //drawingList.add(newShape2);
		 
		 CreateCommand create = new CreateCommand(newShape, 10);
		 //CreateCommand create2 = new CreateCommand(newShape2, 20);
		 Invoker i = new Invoker(create);
		 i.activate();
		 
		 DrawCommand draw = new DrawCommand(newShape);
		 Invoker i2 = new Invoker(draw);
		 i2.activate();
		 
		 DeleteCommand delete = new DeleteCommand(newShape, drawingList);
		 Invoker i3 = new Invoker(delete);
		 i3.activate();
		 */
	 }
}
