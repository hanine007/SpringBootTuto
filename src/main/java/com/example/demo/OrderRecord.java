package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public record OrderRecord(
@JsonProperty("product_name")
 String productName,
 @JsonProperty("customer_name")

 String customerName,
 @JsonProperty("qt")

int quantity) {

}
