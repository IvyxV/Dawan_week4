package fr.dawan.Maven;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static Logger myLogger = LogManager.getLogger(App.class.getName());
	private static Logger myLoggerError = LogManager.getLogger("myLogger2");

	public static void main(String[] args) {
		myLogger.info("My first log");
		myLogger.warn("My first warning");
		myLoggerError.log(Level.ERROR, new NullPointerException("null example"));
		myLoggerError.error("encore une erreur bidon.");
		System.out.println("Révision objet");
		try {
		} catch (Exception e) {
			System.out.println(e.getMessage());
			myLoggerError.error(e.getMessage(), e);
		}
	}
}
