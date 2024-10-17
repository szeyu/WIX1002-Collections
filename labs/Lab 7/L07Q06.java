import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.List;
import java.util.ArrayList;

class Order {
    private String OrderID;
    private String ProductID;
    private int OrderQuantity;
    
    public Order(String OrderId, String ProductId, int OrderQuantity){
        this.OrderID = OrderId;
        this.ProductID = ProductId;
        this.OrderQuantity = OrderQuantity;
    }

    
    public String getOrderID(){
        return OrderID;
    }
    
    public String getProductID(){
        return ProductID;
    }
    
    public int getOrderQuantity(){
        return OrderQuantity;
    }
    
    public String toString(){
        return OrderID + "," + ProductID + "," + OrderQuantity;
    }
}

class Product {
    private String ProductID;
    private String ProductName;
    private double ProductPrice;
    
    public Product(String ProductID, String ProductName, double ProductPrice){
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
    }
    
    public String getProductID(){
        return ProductID;
    }
    
    public String getProductName(){
        return ProductName;
    }
    
    public double getProductPrice(){
        return ProductPrice;
    }
    
    public String toString(){
        return ProductID + "," + ProductName + "," + ProductPrice;
    }
}

public class L07Q06 {
    
    public static void main(String[] args) {
        List<Order> orders = readOrders("src/Week09/Lab07/order.txt");
        List<Product> products = readProducts("src/Week09/Lab07/product.txt");
        
//        for(Order order : orders){
//            System.out.println(order.toString());
//        }
//        for(Product product : products){
//            System.out.println(product.toString());
//        }
    
        
        System.out.printf("%-13s%25s%15s%20s%15s%n","ProductID","ProductName","Quantity","PricePerUnit","Total");
        
        for(Product product : products){
            int quantity = findQuantity(product.getProductID(), orders);
            if (quantity == 0)
                continue;
            double total = quantity * product.getProductPrice();
            System.out.printf("%-13s%25s%15d%20.2f%15.2f%n",product.getProductID(),product.getProductName(),quantity,product.getProductPrice(),total);
        }
    }
    
    public static List<Order> readOrders(String filePath){
        List<Order> orders = new ArrayList<>();
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = in.readLine()) != null) {
                System.out.println(line);
                String[] ordersObject = line.split(",");
                Order order = new Order(ordersObject[0], ordersObject[1], Integer.parseInt(ordersObject[2]));
                orders.add(order);
                System.out.println(order.toString());
            }
                    
            in.close();
            
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Problem with the file input");
        }
        
        return orders;
    }
    
    public static List<Product> readProducts(String filePath){
        List<Product> products = new ArrayList<>();
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = in.readLine()) != null) {
//                System.out.println(line);
                String[] productsObject = line.split(",");

                Product product = new Product(productsObject[0], productsObject[1], Double.parseDouble(productsObject[2]));
                products.add(product);
            }
            
            in.close();
            
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Problem with the file input");
        }
        
        return products;
    }
    
    public static int findQuantity(String productID, List<Order> orders){
        int quantity = 0;
        for(Order order : orders){
            if(productID != null && order.getProductID() != null && order.getProductID().equals(productID))
                return order.getOrderQuantity();
        }
        
        return quantity;
    }
}
