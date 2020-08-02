/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentB;

/**
 *
 * @author svd12115
 */
public class ComponentB implements ComponentBProvidedInterface {

    @Override
    public void componentBMethod1() {
        System.out.println("Component B method 1");
    }

    @Override
    public void componentBMethod2() {
        System.out.println("Component B method 2");
    }
    
}
