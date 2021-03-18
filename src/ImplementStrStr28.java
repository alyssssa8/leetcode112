public class ImplementStrStr28 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack, String needle) {
        int L = needle.length();
        int n = haystack.length();
        for (int i = 0; i < n - L + 1; i++){
            if (haystack.substring(i, i + L).equals(needle)){
                System.out.println(i);
                return i;
            }
        }

        return -1;
    }
}
