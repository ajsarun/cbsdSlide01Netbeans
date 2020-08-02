/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package componentA;

import componentB.ComponentBProvidedInterface;

/**
 *
 * @author svd12115
 */
public class ComponentA implements ComponentAProvidedInterface {
    
    @Override
    public void componentAMethod1(ComponentBProvidedInterface comp) {
        System.out.println("Component A method 1");
        comp.componentBMethod1();
    }

    @Override
    public void componentAMethod2(ComponentBProvidedInterface comp) {
        System.out.println("Component A method 2");
        comp.componentBMethod2();
    }
    
}
