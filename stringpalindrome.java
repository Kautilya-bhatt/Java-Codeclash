import java.util.*;
public class  stringpalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();
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