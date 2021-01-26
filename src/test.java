public class test {
    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        Static.removeDuplicates(nums);
//        int array [] = new int[nums];
        Static.m2();
        Static.m1();
        StaticStudent.setCllg("XYZ");

        StaticStudent s1 = new StaticStudent("Alice");
        StaticStudent s2 = new StaticStudent("Bob");

        s1.getStudentInfo();
        s2.getStudentInfo();

        StaticOuterClass.InnerClass myInner = new StaticOuterClass.InnerClass();
        System.out.println(myInner.y);
        SingletonExample.doSomething();
        SingletonExample.getInstance();
    }


}




