package singleton;

public class Experiment {
	private String result;
	private static Experiment ex = null;
	private Experiment() {
		result = "";
	}
	public static Experiment getEx() {
            if (ex == null) {
                ex = new Experiment();
            }
            return ex;
	}
	public void setResult(String r) {
		result = r;
	}
	public String getResult() {
		return result;
	}
}



