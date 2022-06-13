public class Product{
   String productId;
   String productName;
   double price;
   int availableQuantity;

  void setProductId(String newValue){
     productId = newValue;
  }

  String getProductId(){
     return productId;
  }

   void setProductName(String newValue){
     productName = newValue;
  }

   String getProductName(){
     return productName;
  }

   void setPrice(double newValue){
       price = newValue;
  }

   double getPrice(){
      return price;
  }

   void setAvailableQuantity(int newValue){
      availableQuantity = newValue;
  }

   int getAvailableQuantity(){
     return availableQuantity;
  }

   void showDetails(){
     System.out.println("ProductId:" + productId + "ProductName:" + productName + "Price:" + price + "AvailableQuantity:" + availableQuantity);
  }

   public static void main(String[] args){
        Product pro1=new Product();
        Product pro2=new Product();

    pro1.setProductId("1");
    pro1.setProductName("GP");
    pro1.setPrice(100);
    pro1.setAvailableQuantity(10);
    pro1.showDetails();
    pro2.setProductId("2");
    pro2.setProductName("ROBI");
    pro2.setPrice(200);
    pro2.setAvailableQuantity(50);
    pro2.showDetails();
  }
}  


