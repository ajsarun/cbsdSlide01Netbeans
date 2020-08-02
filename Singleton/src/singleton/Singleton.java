/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author sarun
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Experiment myEx = Experiment.getEx();
	myEx.setResult("Good");
	System.out.println(myEx.getResult());
	Experiment myEx1 = Experiment.getEx();
	System.out.println(myEx1.getResult());
    }
}
