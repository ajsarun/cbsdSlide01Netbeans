/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobserver;

import java.util.Observable;

/**
 *
 * @author sarun
 */
public class MyObservable extends Observable {
    private int a;
    public void setA(int val) {
        a = val;
        setChanged();
        notifyObservers();
    }
    public int getA() {
        return a;
    }
}
