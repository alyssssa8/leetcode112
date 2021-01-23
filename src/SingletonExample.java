public class SingletonExample {
//    Early Instantiation: creation of instance at load time.


    private static SingletonExample instance  = new SingletonExample();
    private SingletonExample(){

    }
    public static SingletonExample getInstance(){
        return instance;
    }
    public static void doSomething(){
        System.out.println("this is singleton");
    }

//    Lazy Instantiation: creation of instance when required.

//    private static SingletonExample obj;
//    private SingletonExample(){}
//
//    public static SingletonExample  getA(){
//        if (obj == null){
//            synchronized(Singleton.class){
//                if (obj == null){
//                    obj = new Singleton();//instance will be created at request time
//                }
//            }
//        }
//        return obj;
//    }
//
//    public void doSomething(){
//        //write your code
//    }


}
