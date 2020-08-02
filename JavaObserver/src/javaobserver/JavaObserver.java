/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobserver;

import java.util.Observer;

/**
 *
 * @author sarun
 */
public class JavaObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observer obj = new MyConcreteObserver();
        MyObservable observable = new MyObservable();
        observable.addObserver(obj);
        observable.setA(8);
	observable.setA(9);
    }
}
