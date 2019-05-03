package assignment4;
import java.util.ArrayList;
import java.util.Scanner;
public class Cart {
    public int id;
    public String customer;
    public String city;
    public float grandTotal;
    public ArrayList<Product> productlist;



	public Cart() {
    }
	
	public Cart(int id, String customer, String city, float grandTotal, ArrayList productlist) {
        this.id = id;
        this.customer = customer;
        this.city = city;
        this.grandTotal = grandTotal;
        this.productlist = productlist;
	}
    public void themsanpham() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma san pham:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap ten nguoi mua:");
        String customer = input.nextLine();
        System.out.println("Nhap ten thanh pho:");
        String city = input.nextLine();
        Product product = new Product(id, customer, city, grandTotal);
        productlist.add(product);
    }

    public void xoasanpham() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id cua san pham can xoa:");
        int id = input.nextInt();
        for (int i = 0; i < productlist.size(); i++) {
            if (productlist.get(i).id == id) {
                productlist.remove(i);
            }
        }
    }

    public void tinhtongtien(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tong gia tri:");
            grandTotal = input.nextFloat();
        if(city == "HN"){
            grandTotal = grandTotal+(grandTotal*1/100);
        }
        else if(city == "HCM"){
            grandTotal = grandTotal+(grandTotal*2/100);
        }
    }
}
