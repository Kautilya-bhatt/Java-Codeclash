import java.util.*;
public class destinction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a marks: ");
         int marks = sc.nextInt();
         if (marks >= 40)
            {
                if(marks >= 75)
                {
                    System.out.println(" distinction ....... ");
                }
                else{
                    System.out.println(" Pass but not got distinction .......");                
             }
            }
         else
         {
            System.out.println("Fail");
         }
        }
        
    
}

