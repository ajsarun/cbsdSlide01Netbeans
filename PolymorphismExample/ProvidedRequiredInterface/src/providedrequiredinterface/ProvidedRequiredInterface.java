/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package providedrequiredinterface;

import componentA.ComponentA;
import componentB.ComponentB;

/**
 *
 * @author svd12115
 */
public class ProvidedRequiredInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComponentA objA = new ComponentA();
        ComponentB objB = new ComponentB();
        objA.componentAMethod1(objB);
        objA.componentAMethod2(objB);
        
    }
    
}
