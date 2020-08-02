/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author sarun
 */
public interface Source {
    public void notifyObservers();
    public void register(MyObserver observer);
}
