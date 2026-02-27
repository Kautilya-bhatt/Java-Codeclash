import java.util.Scanner;

public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a num : ");
        int num=sc.nextInt();
        int originalNum=num;
        int reversenum=0;

        while(num>0)
        {
            int digit = num % 10;
            reversenum=reversenum*10+digit;
            num=num/10;

        }
        if(originalNum == reversenum)
        {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
        sc.nextLine();
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        String originalstr =str;
        String reversestr="";

        for(int i=str.length()-1 ; i>=0 ; i--)
        {
            reversestr=reversestr+str.charAt(i);
           }
        if(originalstr.equalsIgnoreCase(reversestr))
        {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
