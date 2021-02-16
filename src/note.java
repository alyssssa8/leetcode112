import java.util.*;

public class note {


    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray26 sss  = new RemoveDuplicatesFromSortedArray26();
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        sss.removeDuplicates2(nums);
        RemoveDuplicatesFromSortedArray26.removeDuplicates(nums);
//        test.removeDuplicates();

//        https://www.w3schools.com/java/



//        indexOf()
//            method returns the position of the first occurrence of a specified
//            value in a string. This method returns -1 if the value to search for never occurs.
//            Note: The indexOf() method is case sensitive
//            String myStr = "Hello planet earth, you are a great planet.";
//            System.out.println(myStr.indexOf("planet"));
//            output: 6//index
//            Find the first occurrence of the letter "e" in a string, starting the search at position 5:
//            System.out.println(myStr.indexOf("e", 5));

//        replaceAll()
//            replaces all occurrences of "a" to "b"
//            String s1 = str1.replaceAll("\\s", "");
//
//        charAt(i)

//        S.toUpperCase()

//        int nums []={-1,0,3,5,9,12};
//        Int num = input.nextInt();
//
//        Int array;
//        array = new int[num];
//
//        int array [] = new int[num];
//
//        System.out.printf("Factorial of %d = %d", num, factorial);


//        map:
//          Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//          map.put(nums[i], i);  // key and value
//          map.containsKey(target - nums[i])
//          map.get(s1.charAt(i)
//          getKey
//          getValue
//          first.putIfAbsent(A[i], i);
//          count.put(A[i], count.getOrDefault(A[i], 0) + 1);
//              The getOrDefault(Object key, V defaultValue) method of Map interface,
//              implemented by HashMap class is used to get the value mapped with specified key.
//              If no value is mapped with the provided key then the default value is returned.

//          HashMap<String, Integer> map
//                   = new HashMap<>();
//          map.put("a", 100);
//          map.put("b", 200);
//          map.put("c", 300);
//          map.put("d", 400);
//
//        // print map details
//        System.out.println("HashMap: "
//                + map.toString());


//        ConcurrentHashMap
//           put
//           putIfAbsent
//           remove
//                getKey
//                getValue
//        set:
//          Set<Integer> set = new HashSet<>();
//          set.add(nums1[i]);
//          set.contains(nums2[i])


//        List:
//             List<String> list = new ArrayList<>();
//             list.add(String.valueOf(i));


//        queue
//                Queue<Integer> q = new LinkedList<>()
//                q.add();
//                q.remove()//to remove the head of queue
//                q.peek() // to view the head of th queue
//                q.poll()
//                q.offer()
//                      The Queue interface specifies that add() will throw an IllegalStateException
//                      if no space is currently available (and otherwise return true)
//                      while offer() will return false if the element couldn't be inserted due to
//                      capacity restrictions.

//                      public class ThePoint {
//                          int x;
//                          int y;
//                          public ThePoint(int x, int y){
//                               this.x = x;
//                               this.y  = y;
//                          }
//                      }
//              Queue<ThePoint> myQueue = new ArrayDeque<ThePoint>();  //FloodFill733
//              myQueue.add(new ThePoint(sr, sc));
//


//        StringBuilder
//                StringBuilder sb  = new StringBuilder();
//                sb.toString()
//                sb.insert(i,'-');
//                sb.append(S);


//        Integer.MIN_VALUE

//        String.valueOf(i)
//              Returns the string representation of the int argument.

//        length:
//            int[] nums-->length
//            String s = "sdkfjsk"-->length()

    }
}
