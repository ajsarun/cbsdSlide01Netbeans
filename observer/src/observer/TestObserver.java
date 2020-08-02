/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author user
 */
public class TestObserver {
    public static void main(String[] args) {
	Senior obj1 = new Senior();
	Marketing obj2 = new Marketing();
	HeadQuater obj = new HeadQuater();              
	obj.register(obj1);              
	obj.register(obj2);              
	obj.setSomeData(6);
        obj.setSomeData(7);
    }
}
