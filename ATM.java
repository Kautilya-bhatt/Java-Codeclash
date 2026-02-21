import java.util.*;
 class Atm 
{

    public static void main(String[] args) {
        int my_pin=2005;
        boolean balance=true;
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a pin : ");
         int pin = sc.nextInt();
        
         if (pin == my_pin)
         {
             System.out.println("Pin is correct ");
            if (balance )
            {
                System.out.println("balance is Sufficient ");
            }
            
         }
         if (pin != my_pin)
            {
                System.out.println("Incorrect Pin ");
            }
         else{
            System.out.println("Insufficent Balance");
         }
        }
    }
            
              