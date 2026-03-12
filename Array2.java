import java .util.Scanner;

public class Array2 {
    public static void main(String args[])
    { int ar[][]=new int[3][3];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array elements: ");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
            {
                 System.out.print("Element : ");
                 ar[i][j]=sc.nextInt();
            }     
     }
     for(int i=0;i<3;i++)
     {
         for(int j=0;j<3;j++)
         {
               System.out.print(ar[i][j] +" ,");
         }
         System.out.println();
     
     }

    }
}
