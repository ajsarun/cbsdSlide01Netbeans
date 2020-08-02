/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author user
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyAggregatedClass obj = new MyAggregatedClass();
        MyClass obj1 = new MyClass(obj);
        obj1.func();
    }
    
}
