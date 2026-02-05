public class find_original_price {
    public static void main(String[] args) {
        int item1=1000;
        int discount1=5;
         int item2=2000;
        int discount2=10;
         int item3=3000;
        int discount3=15;
         int item4=4000;
        int discount4=15;
         int item5=5000;
        int discount5=10;
        float original_price;

        original_price=(item1-((item1*discount1)/100))+ (item2-((item2*discount2)/100))+(item3-((item3*discount3)/100))+ (item4-((item4*discount4)/100))+(item5-((item5*discount5)/100));
        System.out.println("ORIGINAL PRICE = "+ original_price);

        
    }
    
}
