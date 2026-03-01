package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    // jsonProperty servent a indiquer le nom du champ json attendue dans ce cas 
@JsonProperty("product_name")
private String productName ;
@JsonProperty("customer_name")

private String customerName;
@JsonProperty("qt")

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
