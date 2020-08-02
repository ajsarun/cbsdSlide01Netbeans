package factory;

public class AutomobileFactory {
	public static Automobile createAutomobile(String type) {
		if (type.equals("Toyota")) 
			return new Toyota();
		else if (type.equals("Ford"))
			return new Ford();
		return null;
	}
}