package kr.co.yunju.product.management;

public class Product {
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    private Long id;
    private String name;
    private Integer price;
    private Integer amount;
}
