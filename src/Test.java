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
import Command.DrawCommand;
import Command.RectangleCommand;
import Command.ShapeCommandInterface;
public class Test {
//This is test!
	public static void main(String[] args) throws Exception{
		// ArrayList<Shape> drawingList = new ArrayList<Shape>();
	//	 Invoker i;
		// File file = new File("./src/commandTest.txt");
		// BufferedReader br = new BufferedReader(new FileReader(file));
		 //ShapeCommandInterface circle = new Circle(10);


		 ShapeCommandInterface shapeTestC = new CircleCommand(25);
		 CreateCommand createC = new CreateCommand(shapeTestC);
		 CommandInvoker circleCreateInvoker = new CommandInvoker(createC);
		 circleCreateInvoker.activate();

		 ColorCommand colorc = new ColorCommand(shapeTestC,Color.GREEN);
		 CommandInvoker circleColorInvoker = new CommandInvoker(colorc);
		 circleColorInvoker.activate();


		 DrawCommand drawC = new DrawCommand(shapeTestC);
		 CommandInvoker cD = new CommandInvoker(drawC);
		 cD.activate();

		 ShapeCommandInterface shapeTestR = new RectangleCommand(15,20);
		 CreateCommand createR = new CreateCommand(shapeTestR);
		 CommandInvoker rI = new CommandInvoker(createR);
		 rI.activate();

		 DrawCommand drawR = new DrawCommand(shapeTestR);
		 CommandInvoker rD = new CommandInvoker(drawR);
		 rD.activate();


		 //ShapeCommandInterface circle = new Circle(10);
    /*
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
					shape = drawingList.get(Integer.parseInt(parseCommand[1]));
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
					ColorCommand color = new ColorCommand(shape,Color.getColor(parseCommand[1]));
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
		*/


	 }
}
