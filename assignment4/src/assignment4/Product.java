package assignment4;

public class Product {
    int id;
    char productname;
    int qty;
    float price;

    public Product(int id, String customer, String city, float grandTotal) {
    }

    public Product(int id, char productname, int qty, float price) {
        this.id = id;
        this.productname = productname;
        this.qty = qty;
        this.price = price;
    }

    public static void main(String[] args){
        int qty = 0;
        if(qty>0){
            System.out.println("Con Hang");
        }
        else{
            System.out.println("Het Hang");
        }


    }
}