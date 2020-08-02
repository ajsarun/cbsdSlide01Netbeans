package facade;
public class MyFacade {
    private static MyFacade myFacadeObj = null;
        private MyFacade() {}
        public static MyFacade getMyFacadeObject() {
            if (myFacadeObj == null) {
                myFacadeObj = new MyFacade();
            } 
            return myFacadeObj;
        }
        public void class1Func() {
            MyClass1 obj = new MyClass1();
            obj.myClass1Func();
        }
        public void class2Func() {
            MyClass2 obj = new MyClass2();
            obj.myClass2Func();
        }
}


