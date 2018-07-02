package com.oleksii.pchelintsev;

import java.io.IOException;
import java.util.Date;
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
		
//		consoleHandler.setFilter(new Filter(){
//			@Override
//			public boolean isLoggable(LogRecord record) {
//				return record.getMessage().endsWith("max");
//			}
//			
//		});
		
		logger.info(String.valueOf((new Circle(5).getArea())));
		logger.info(String.valueOf(new Triangle(3,4,5).getArea()));
		logger.info(String.valueOf(new Square(10).getArea()));
	}
}
