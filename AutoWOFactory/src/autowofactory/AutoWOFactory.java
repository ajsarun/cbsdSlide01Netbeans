/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autowofactory;

/**
 *
 * @author sarun
 */
public class AutoWOFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automobile myAuto = getCarTypeFromUser("Ford");
	System.out.println(myAuto);
    }
    public static Automobile getCarTypeFromUser(String type) {
        Automobile auto = null;
        if (type.equals("Toyota")) 
            auto = new Toyota();
	else if (type.equals("Ford"))
            auto = new Ford();
	return auto;
    } 
}
