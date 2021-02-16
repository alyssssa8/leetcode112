import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        // Creating a list
        List<Integer> l1
                = new ArrayList<Integer>();

        // Adds 1 at 0 index
        l1.add(0, 1);

        // Adds 2 at 1 index
        l1.add(1, 2);
        System.out.println(l1);

        // Creating another list
        List<Integer> l2
                = new ArrayList<Integer>();

        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);
//
//        // Removes element from index 1
//        l1.remove(1);
//        System.out.println(l1);
//
//        // Prints element at index 3
//        System.out.println(l1.get(3));
//
//        // Replace 0th element with 5
//        l1.set(0, 5);
//        System.out.println(l1);
//
//
//
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
////        Static.removeDuplicates(nums);
////        int array [] = new int[nums];
//        Static.m2();
//        Static.m1();
//        StaticStudent.setCllg("XYZ");
//
//        StaticStudent s1 = new StaticStudent("Alice");
//        StaticStudent s2 = new StaticStudent("Bob");
//
//        s1.getStudentInfo();
//        s2.getStudentInfo();
//
//        StaticOuterClass.InnerClass myInner = new StaticOuterClass.InnerClass();
//        System.out.println(myInner.y);
//        SingletonExample.doSomething();
//        SingletonExample.getInstance();
    }


}




