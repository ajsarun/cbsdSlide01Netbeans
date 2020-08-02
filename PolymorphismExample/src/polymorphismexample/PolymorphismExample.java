/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphismexample;

/**
 *
 * @author sarun
 */
public class PolymorphismExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fie obj = new Fie();
        print(obj, 4);
    }
    public static void print(Fie obj, int val) {
        obj.func1(val);
        
    } 
}
