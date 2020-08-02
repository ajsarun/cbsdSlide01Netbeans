/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author user
 */
public class MyClass {
    private MyAggregatedClass ac;
    
    public MyClass(MyAggregatedClass ac) {
        this.ac = ac;
    }
    public void func() {
        ac.func1();
    }
    
}
