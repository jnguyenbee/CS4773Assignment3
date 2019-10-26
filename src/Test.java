import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import Command.CircleCommand;
import Command.ColorCommand;
import Command.CommandInvoker;
import Command.CreateCommand;
import Command.DeleteCommand;
import Command.DrawCommand;
import Command.MoveCommand;
import Command.RectangleCommand;
import Command.SelectCommand;
import Command.ShapeCommandInterface;
public class Test {

	public static void main(String[] args) throws Exception{
		// ArrayList<Shape> drawingList = new ArrayList<Shape>();
		// Invoker i;
		 File file = new File("./src/commandTest.txt");
		 BufferedReader br = new BufferedReader(new FileReader(file));
		 ShapeCommandInterface shape = null;
		 ArrayList<ShapeCommandInterface> drawingList = new ArrayList<ShapeCommandInterface>();

		String line;
		String [] parseCommand;
		while((line = br.readLine())!= null)
		{
			parseCommand = line.split(" ");
			switch(parseCommand[0])
			{
				case "CREATE": //todo: create needs to fix both circle and rectangle

					if(parseCommand[1].equals("CIRCLE")) {
						ShapeCommandInterface shapeCircle = new CircleCommand(Integer.parseInt(parseCommand[2]));
						CreateCommand createCircle = new CreateCommand(shapeCircle);
						CommandInvoker circleCreateInvoker = new CommandInvoker(createCircle);
						circleCreateInvoker.activate();

						shape = shapeCircle;
					}
					if(parseCommand[1].equals("RECTANGLE")) {
						 ShapeCommandInterface shapeRect = new RectangleCommand(Integer.parseInt(parseCommand[2]), Integer.parseInt(parseCommand[3]));
						 CreateCommand createRect = new CreateCommand(shapeRect);
						 CommandInvoker rectCreateInvoker = new CommandInvoker(createRect);
						 rectCreateInvoker.activate();

						 shape = shapeRect;

					}
					drawingList.add(shape);
					break;
				case "SELECT":
					if(Integer.parseInt(parseCommand[1])-1 >= drawingList.size())
					{
						System.out.println("ERROR: invalid shape for SELECT");
					}
					else {
						shape = drawingList.get(Integer.parseInt(parseCommand[1])-1);
						SelectCommand select = new SelectCommand(shape);
						CommandInvoker selectInvoker = new CommandInvoker(select);
						selectInvoker.activate();
					}
					break;
				case "MOVE":
					MoveCommand move = new MoveCommand(shape,Integer.parseInt(parseCommand[1]), Integer.parseInt(parseCommand[2]));
					CommandInvoker moveInvoker = new CommandInvoker(move);
					moveInvoker.activate();
					break;
				case "DRAW":
					DrawCommand draw = new DrawCommand(shape);
					CommandInvoker drawInvoker = new CommandInvoker(draw);
					drawInvoker.activate();
					break;
				case "COLOR":
					Color newColor  = (Color) Color.class.getField(parseCommand[1].toLowerCase()).get(null);
					ColorCommand color = new ColorCommand(shape,newColor);
					CommandInvoker colorInvoker = new CommandInvoker(color);
					colorInvoker.activate();
					break;
				case "DELETE":
					DeleteCommand delete = new DeleteCommand(shape);
					CommandInvoker deleteInvoker = new CommandInvoker(delete);
					deleteInvoker.activate();
					break;

				case "DRAWSCENE":
					for(ShapeCommandInterface n : drawingList)
					{
						n.draw();
					}
					break;
			}
		}
	 }
}
