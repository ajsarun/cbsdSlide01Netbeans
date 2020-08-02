/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author sarun
 */
public class Senior implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
	 "(senior) headquater is updated to " + 
                ((HeadQuater)o).getSomeData());
    }
}
