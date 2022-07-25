package com.saurabh.products;

public interface Isearchproducts {

    default String[] searchproduct() {
        return searchproduct();
    }

    String[] searchproduct(String catalogue);
}
