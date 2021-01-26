public class Static {
    // static
    static int a = 10;
    static int b = 20;

    // static block
    static {
        System.out.println("Static block initialized.");
        System.out.println("1 " + a);
        System.out.println("2 " + b);
        b = a * 4;
    }

    static void m1()
    {
        a = 20;
        System.out.println("from m1");

        // Cannot make a static reference to the non-static field b
        b = 10; // compilation error

        // Cannot make a static reference to the
        // non-static method m2() from the type Test
        m2(); // compilation error

        // Cannot use super in a static context
        //System.out.println(super.a); // compiler error
    }

    // instance method
    static void m2()
    {
        System.out.println("from m2");
    }

    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};

        System.out.println("a1: "+a);
        a +=10;
        System.out.println("a2: "+a);
        System.out.println(b);

    }


}
