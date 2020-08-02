/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import facade.MyFacade;

/**
 *
 * @author sarun
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFacade obj = MyFacade.getMyFacadeObject();
        obj.class1Func();
        obj.class2Func();
        
    }
}
