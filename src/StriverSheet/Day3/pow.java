package StriverSheet.Day3;

public class pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000,
                -2147483648));
        System.out.println(Math.pow(2.00000,
                -2147483648));
    }

    public static double myPow(double x, long n) {

        if(n<0 ) {
            x=(1/x);
            n=n*(-1);
        }
        if(n==0) return 1;
        if(n==1) return x;

        if(n%2==0){
            double calc=myPow(x,n/2);
            return calc*calc;
        }

        double calc=myPow(x,n/2);
        return x*calc*calc;

    }
}
