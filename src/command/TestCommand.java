package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.BLACK);
		DrawingModel model = new DrawingModel();
		
		//Testiranje dodavanja tačke
		AddPointCmd addPointCmd = new AddPointCmd(model, p1);
		addPointCmd.execute();
		
		System.out.println(model.getShapes());
		
		//Testiranje brisanja
		RemovePointCmd removePointCmd = new RemovePointCmd(model, p1);
		removePointCmd.execute();
		
		System.out.println(model.getShapes());
		System.out.println(addPointCmd);
		
		removePointCmd.unexecute();
		
		//Testiranje izmene
		Point p2 = new Point(20, 20, Color.RED);
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		updatePointCmd.execute();
		System.out.println(model.getShapes());
		
		updatePointCmd.unexecute();
		System.out.println(model.getShapes());

	}

}
