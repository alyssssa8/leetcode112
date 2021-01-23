public class CallPublicInterface {
    public static void main(String[] args) {
        TestInterface TF = new TestInterface();
        TF.interA();
        TF.interB();
        TF.interC();
        TF.interD();

//        //interface with abstract.
//        interfaceB b = new M();
//        b.interB();

        // interface with public,
        M b = new M();
        b.interA();
        b.interC();
        b.interD();

        interfaceA a = new M();
        a.interA();
        a.interC();
        a.interD();

//        M c = new C();
//        c.interA();
//        c.interC();
//        c.interD();
        interfaceA d = new C();
        d.interA();
        d.interC();
        d.interD();
    }


}
