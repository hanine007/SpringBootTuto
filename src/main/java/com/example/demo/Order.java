package com.example.demo;

public class Order {

private String productName ;
private String customerName;
private int quantity;
// method setter elle sera utuliser par spring pour recupere la valeur de ce champ
public void setProductName(String ProductName){
    this.productName=ProductName;
}
//appelle le getter pour serialisez en json 
public String getProductName(){
    return productName;
}







public void setCustomerName(String CustomerName){
    this.customerName=CustomerName;
}
public String getCustomerName(){
    return customerName;
}

 public int getQuantity() {
    return quantity;
 }
 public void setQuantity(int quantity) {
    this.quantity = quantity;
 }


 @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", quantity=" + quantity +
                '}';
    } 

}
