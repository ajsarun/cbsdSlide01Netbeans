/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author sarun
 */
public class MyConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(((MyObservable)o).getA());
      }
}
