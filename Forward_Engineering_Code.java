//Source file: C:\\Program Files\\Customer.java


private class Bill 
{
   private int productid;
   private float amount;
   private int quantity;
   private int customerid;
   private string customerphnnum;
   public Product theProduct;
   
   /**
    * @roseuid 5E9D82E30389
    */
   public Bill() 
   {
    
   }
   
   /**
    * @return string
    * @roseuid 5E9D7EED0272
    */
   public string generatebill() 
   {
    return null;
   }
}

public class Customer 
{
   private String phonenum;
   private String name;
   private String address;
   private int customerid;
   public Orderdate theOrderdate;
   public Bill theBill;
   
   /**
    * @roseuid 5E9D82E3039D
    */
   public Customer() 
   {
    
   }
   
   /**
    * @return String
    * @roseuid 5E9D7DEC0287
    */
   public String addcustomer() 
   {
    return null;
   }
   
   /**
    * @return String
    * @roseuid 5E9D7E0D03C5
    */
   public String editcustomer() 
   {
    return null;
   }
   
   /**
    * @return String
    * @roseuid 5E9D7E120318
    */
   public String deletecustomer() 
   {
    return null;
   }
   
   /**
    * @return String
    * @roseuid 5E9D7E1802BC
    */
   public String addbankaccount() 
   {
    return null;
   }
}

private class Orderdate 
{
   private Int orderid;
   private int customerid;
   private String name;
   private int productid;
   private float amount;
   private datetime orderdate;
   
   /**
    * @roseuid 5E9D82E303A7
    */
   public Orderdate() 
   {
    
   }
   
   /**
    * @return String
    * @roseuid 5E9D7E950027
    */
   public String createorder() 
   {
    return null;
   }
   
   /**
    * @return tring
    * @roseuid 5E9D7E9D02E6
    */
   public tring editorder() 
   {
    return null;
   }
}

private class Product 
{
   private int productid;
   private float productprice;
   private String roducttype;
   public Orderdate theOrderdate;
   public Stock theStock;
   
   /**
    * @roseuid 5E9D82E303BB
    */
   public Product() 
   {
    
   }
   
   /**
    * @return String
    * @roseuid 5E9D7F4603BB
    */
   public String addproduct() 
   {
    return null;
   }
   
   /**
    * @return String
    * @roseuid 5E9D7F4E00B9
    */
   public String modifyproduct() 
   {
    return null;
   }
   
   /**
    * @return String
    * @roseuid 5E9D7F56004D
    */
   public String selectproduct() 
   {
    return null;
   }
}

private class Stock 
{
   private int productid;
   private int quantity;
   private int vendorid;
   
   /**
    * @roseuid 5E9D82E303CF
    */
   public Stock() 
   {
    
   }
   
   /**
    * @return String
    * @roseuid 5E9D7F7401B8
    */
   public String addstock() 
   {
    return null;
   }
   
   /**
    * @return String
    * @roseuid 5E9D7F7A01AD
    */
   public String modifystock() 
   {
    return null;
   }
   
   /**
    * @return String
    * @roseuid 5E9D7F7D034C
    */
   public String selectstockitem() 
   {
    return null;
   }
}

private class VendorDetails 
{
   private int vendorid;
   private int productid;
   private float productprice;
   private string producttype;
   private string phnnum;
   public Product theProduct;
   public Stock theStock;
   
   /**
    * @roseuid 5E9D82E303D9
    */
   public VendorDetails() 
   {
    
   }
   
   /**
    * @return string
    * @roseuid 5E9D7F1A0390
    */
   public string updatedetails() 
   {
    return null;
   }
}