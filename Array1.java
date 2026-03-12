import java .util.Scanner;

public class Array1 {
    public static void main(String args[])
    { int ar[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array elements: ");
      for(int i=0;i<5;i++)
      {
        System.out.print("Element : ");
         ar[i]=sc.nextInt();
     }
     for(int i=0;i<5;i++)
     {
        System.out.println(ar[i]);
     }

    }
}

