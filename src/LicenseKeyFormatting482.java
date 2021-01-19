public class LicenseKeyFormatting482 {

    public static void main(String[] args) {
       String  result = licenseKeyFormatting("5F3Z-2e-9-w",4);
        System.out.println(result);
    }
    public static String licenseKeyFormatting(String S, int K) {
        S = S.replaceAll("[-]","");
        S = S.toUpperCase();
        StringBuilder sb  = new StringBuilder();
        sb.append(S);
        int i = sb.length()-K;
        while (i>0){
            sb.insert(i,'-');
            i=i-K;
        }
        return sb.toString();

    }
}
