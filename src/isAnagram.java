import java.util.Arrays;
tttt
public class isAnagram {

    public static void main(String[] args) {
        String word1 = "abcde";
        String word2 = "bcedfg";
        boolean result = isAnagram(word1, word2);
        System.out.println(result);
    }

    public static boolean isAnagram(String word1, String word2){
        if (word1.length()!= word2.length()){
            return false;
        }
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}
