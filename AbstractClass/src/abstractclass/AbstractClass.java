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
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FooAbstract obj = new FooConcrete1();
        obj.setValue1(3);
        obj.setValue2(5);
        operate(obj);
        
    }
    public static void operate(FooAbstract obj) {
        System.out.println(obj.operate());
    }
    
}
