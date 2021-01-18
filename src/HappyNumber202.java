public class HappyNumber202 {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        int i = 0;
        int upper = 10;
        while(i <upper){
            int temp = 0;
            while (n >0 ){
               temp = temp + (n%10) *(n%10);
               n = n/10;
            }
            System.out.println(temp);
            if (temp == 1){
                return true;
            }
            n = temp;
            i++;
        }
        return false;
    }
}
