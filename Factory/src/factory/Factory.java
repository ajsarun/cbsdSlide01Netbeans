/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author sarun
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        //Automobile myAuto = new Ford();
        Automobile myAuto = 
		AutomobileFactory.createAutomobile("Ford");
	System.out.println(myAuto);
        
    }
}
