package com.oleksii.pchelintsev;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import com.oleksii.pchelintsev.circle.Circle;
import com.oleksii.pchelintsev.square.Square;
import com.oleksii.pchelintsev.triangle.Triangle;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) throws SecurityException, IOException {
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setFormatter(new Formatter() {

			@Override
			public String format(LogRecord record) {
				return record.getLevel() + ": " + record.getMessage() + " : " + new Date() + "\n";
			}
		
		});
		logger.setUseParentHandlers(false);
		logger.addHandler(consoleHandler);
		
		
		List<Shape> figures = new ArrayList();
		
		figures.add(new Triangle(1000,1000,1000));
		figures.add(new Triangle(3,4,5));
		figures.add(new Triangle(6,7,8));
		figures.add(new Triangle(2,2,2));
		
		figures.add(new Circle(5));
		figures.add(new Circle(0));
		figures.add(new Circle(100));
		
		figures.add(new Square(5));
		figures.add(new Square(0));
		figures.add(new Square(-10));
		
		
		Shape maxShape = figures.stream().max(Comparator.comparing(Shape::getArea)).get();
		Shape minShape = figures.stream().min(Comparator.comparing(Shape::getArea)).get();
		
		
		logger.info(maxShape.getClass().getSimpleName() + " " + maxShape.getArea());
		logger.info(minShape.getClass().getSimpleName() + " " + minShape.getArea());
	}
}
