/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractclass;

/**
 *
 * @author svd12115
 */
public class FooConcrete1 extends FooAbstract {

    @Override
    public int operate() {
        return this.getValue1() + this.getValue2();
    }
    
    
}
