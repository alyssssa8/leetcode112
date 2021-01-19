public class fib {
    public static void main(String[] args) {
        fibonacci1();
        System.out.println(fibonacci2(8));
    }

    public static void fibonacci1(){
        int n = 10, t1 = 0,t2 = 1;
        System.out.println("First " + n + " terms: ");
        for (int i  = 1; i<=n; i++){
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2= sum;
        }
        System.out.println('\n');
    }
    public static int fibonacci2(int n){
        if (n <= 1) {
            return n;
        }
        System.out.println(n + " ");
        return fibonacci2(n-1) + fibonacci2(n-2);
    }

}
