/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentB;

/**
 *
 * @author user
 */
public class ComponentB1 implements ComponentBProvidedInterface {

    @Override
    public void componentBMethod1() {
        System.out.println("Component B1 method 1");
    }

    @Override
    public void componentBMethod2() {
         System.out.println("Component B1 method 2");
    }
    
    
}
