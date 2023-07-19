package com.example.products;

public class Product {
    private String productID;
    private String productName;
    private int productQty;
    private int productPrice;

    public Product(String productID, String productName, int productQty, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }

    public Product() {

    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
