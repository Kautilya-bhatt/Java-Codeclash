import java.util.Scanner;

public class Elecricity {
    public static void main(String[] args) {
        double charge,bill;
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a Unit: ");
         int unit = sc.nextInt();
         if(unit >= 0 && unit <=100)
         {
            charge =5.75;
            bill=charge*unit;
            System.out.println("Total bill = "+ bill);
         }
         else if(unit >= 101 && unit <=200)
         {
            charge =7.49;
            bill=charge*unit;
            System.out.println("Total bill = "+ bill);
         }
          else if(unit > 200)
         {
            charge =10.11;
            bill=charge*unit;
            System.out.println("Total bill = "+ bill);
         }
         else{
            System.out.println("Invalid input");
         }

        
    }
    
}
