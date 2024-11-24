package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("sweet", 15, "coco desc");
        products[1] = new Bread("bakery", 5, "bake desc","corn", "white");
        products[3] = new Coke("gas", 15, "coke desc", true, 1.5);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products){
            if (product != null){
                product.showDetails();
            }
        }
    }
}