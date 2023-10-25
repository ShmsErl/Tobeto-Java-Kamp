package org.example;

public class Product {
    private int id;
   private String productName;
   private double unitPrice;
    private int unitInStock;
    private String imgUrl;

    public Product(){}


    public Product(int id, String name, double unitPrice,int unitInStock, String imgUrl ){

        this.id =id;
        this.productName = name;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.imgUrl = imgUrl;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
