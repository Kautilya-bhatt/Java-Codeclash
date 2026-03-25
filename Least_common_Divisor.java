import java.util.*;
public class Least_common_Divisor
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first num: "); 
        int a=sc.nextInt();
        System.out.print("enter second num: ");
        int b=sc.nextInt();
        int max=(a>b)?a:b;
        for(int i=2;i<=max/2;i++)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);  //In this,Those number is greater in Factors 
                 break;   
                                      // that number is the final Answer,called as LCD.
                                        //  //Example:  1st num=15;
                                        //              2nd num=30;
                                        //              Factors=2,3,5;
                                        //LCD= 5 --->Because it is highest in factors
                
             }
         }
}
}

