public interface interfaceA {
    void  interA();
    void  interC();
    void  interD();
}


//            --> interfaceA
//            --> abstract class AbstractInterface implements interfaceA
//            --> public class M extends AbstractInterface
//            --> public class CallAbstractInterface
//            --> interfaceA test = new M();