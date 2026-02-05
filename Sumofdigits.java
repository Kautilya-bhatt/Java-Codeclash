public class Sumofdigits {
    public static void main(String[] args) {
        int a=1234; int b;int c=0;
        while (a > 0)
        {
            b=a%10;
            a=a/10;
            c=b+c;
            System.out.println("num is" + b);
        }
         System.out.println("Sum of all digits = " + c);

        
    }
    
}
