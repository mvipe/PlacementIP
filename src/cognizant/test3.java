package cognizant;

public class test3 {
    public static void main(String[] args) {
        nthPalindrome(1,3);
    }

    static void solution(int p,String uName,String pass){
        if(uName.charAt(4)==pass.charAt(4)){

        }else{
            System.out.println("UserName is not valid");
        }
    }

    static void nthPalindrome(int n, int k)
    {
        int temp = (k & 1)!=0 ? (k / 2) : (k/2 - 1);
        int palindrome = (int)Math.pow(10, temp);
        palindrome += n - 1;

        System.out.print(palindrome);

        if ((k & 1)>0)
            palindrome /= 10;

        while (palindrome>0)
        {
            System.out.print(palindrome % 10);
            palindrome /= 10;
        }
        System.out.println("");
    }
}
