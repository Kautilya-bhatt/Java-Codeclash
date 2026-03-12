import java .util.Scanner;

public class Arraydiagonalsum{
    public static void main(String args[])
    { int ar[][]=new int[3][3];
        int sum=0;
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
            if(ar[i]==ar[j])
            {
              sum=sum+ar[i][j];
            }
               
         }
        System.out.print("The Addition of diagonal matrix is : "+ sum);
     }

    }
}
