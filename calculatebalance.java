public class calculatebalance {
    public static void main(String[] args) {
        float initial_balance=1000000;
        float monthy_expense=9555;
        double interest=2.25;
           
        // month 1
        float month1=(initial_balance-monthy_expense);
        System.out.println("Month 1 balance= " +month1);

        //month 2
        float month2=(month1-monthy_expense);
        float month2a= (float)(month2+(month2*2.25/100));
         System.out.println("Month 2 balance= " +month2a);

           //month 3
           float month3=(month2a-monthy_expense);
        float month3a=(float) (month3+(month3*2.25/100));
         System.out.println("Month 3 balance= " +month3a);

           //month 4
        float month4=(month3a-monthy_expense);
        float month4a=(float)(month4+(month4*2.25/100));
         System.out.println("Month 4 balance= " +month4a);

           //month 5
        float month5=(month4a-monthy_expense);
        float month5a=(float)(month5+(month5*2.25/100));
         System.out.println("Month 5 balance= " +month5a);

           //month 6
        float month6=(month5a-monthy_expense);
        float month6a=(float)(month6+(month6*2.25/100));
         System.out.println("Month 6 balance= " +month6a);

           //month 7
        float month7=(month6a-monthy_expense);
        float month7a=(float)(month7+(month7*2.25/100));
         System.out.println("Month 7 balance= " +month7a);

           //month 8
        float month8=(month7a-monthy_expense);
        float month8a=(float)(month8+(month8*2.25/100));
         System.out.println("Month 8 balance= " +month8a);

           //month 9
        float month9=(month8a-monthy_expense);
        float month9a=(float)(month9+(month9*2.25/100));
         System.out.println("Month 9 balance= " +month9a);

           //month 10
        float month10=(month9a-monthy_expense);
        float month10a=(float)(month10+(month10*2.25/100));
         System.out.println("Month 10 balance= " +month10a);
           //month 11
        float month11=(month10a-monthy_expense);
        float month11a=(float)(month11+(month11*2.25/100));
         System.out.println("Month 11 balance= " +month11a);

           //month 12
        float month12=(month11a-monthy_expense);
        float month12a=(float)(month12+(month12*2.25/100));
         System.out.println("Month 12 balance= " +month12a);

         //##########  final output   ###########

         System.out.println("FINAL DEDUCTED INTEREST AMOUNT = " +month12a);





    }
}
