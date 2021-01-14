import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStones771 {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewlsInStones(J, S));
    }

    public static int numJewlsInStones(String J, String S) {

//      loop the stone, and then if the stone in the string J, then add.
//        100.00%
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                counter = counter + 1;
            }
        }
        return counter;


//        with set
//        int res = 0;
//        Set setJ = new HashSet();
//        for (char j: J.toCharArray())
//            setJ.add(j);
//        for (char s: S.toCharArray())
//            if (setJ.contains(s)) res++;
//        return res;

    }
}
