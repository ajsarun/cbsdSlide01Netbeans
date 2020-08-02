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
public interface ComponentAProvidedInterface {
    public void componentAMethod1(ComponentBProvidedInterface comp);
    public void componentAMethod2(ComponentBProvidedInterface comp);
}
