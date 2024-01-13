abstract class product {
    int pID;
    String name;
    double price;
     public void setProductDetails(int pID, String name, double price){
         this.name=name;
         this.pID=pID;
         this.price=price;

     }
     public void printProductDetails(){

     }
}
class LedTV extends product{
        String brand;
        String technology;
    public void setProductDetails(int pID, String name, double price, String brand, String technology){
        this.name=name;
        this.pID=pID;
        this.price=price;
        this.brand=brand;
        this.technology=technology;
    }

    public void printProductDetails() {
        System.out.println("Name : " + name );
        System.out.println("Product ID : " + pID );
        System.out.println("Price : " + price );
        System.out.println("Brand : " + brand );
        System.out.println("Technology : " + technology );
    }
}
 class MobilePhones extends product{
        String ram;
        String os;
        String sdCard;

     public void setProductDetails(int pID, String name, double price,String ram,String os, String sdCard) {
         this.name = name;
         this.pID = pID;
         this.price = price;
         this.ram = ram;
         this.os = os;
         this.sdCard = sdCard;
     }
     public void printProductDetails() {
         System.out.println("\n\n Name : " + name );
         System.out.println("Product ID : " + pID );
         System.out.println("Price : " + price );
         System.out.println("Ram : " + ram );
         System.out.println("OS : " + os );
         System.out.println("SD Card : " + sdCard );
     }
 }
public class Labtest3 {
    public static void main(String[] args) {
        LedTV obj1=new LedTV();
        obj1.setProductDetails(456, "L13",40000,"SONY","LED");
        obj1.printProductDetails();

        MobilePhones obj2=new MobilePhones();
        obj2.setProductDetails(789,"I5",75000,"16GB","IOS","250GB");
        obj2.printProductDetails();
    }
}