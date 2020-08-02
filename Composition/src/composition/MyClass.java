/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author user
 */
public class MyClass {
    private MyCompositionClass cp;
    public MyClass() {
        cp = new MyCompositionClass();
    }
    public void func() {
        cp.func1();
    }
}
