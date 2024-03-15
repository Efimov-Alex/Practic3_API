package org.example.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    @Id
    private String productId;
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Product(String productId, String name, Integer price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[id=%s, name='%s', price='%s']",
                productId, name, price);
    }
}

