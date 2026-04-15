public class ProductBilling
{
    void bill(double price)
    { 
        System.out.println("billing of 1 product:" + price);
    }
    void bill(double price1,double price2)
    {
        System.out.println("billing of 2product:" + (price1 + price2 ));
    }
    void bill(double price1, double price2, double price3)
    {
        System.out.println("billing of 3 products:" + (price1 + price2 + price3));
    }

    public static void main(String [] args)
        {
            ProductBilling pb = new ProductBilling();
            pb.bill(900);
            pb.bill(900 , 1000);
            pb.bill(900 ,1000 ,3000 );

        }

}