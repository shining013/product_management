package kr.co.yunju.product.management.presentation;

public class ProductDto {
    private Long id;
    private String name;
    private Integer price;
    private Integer amount;
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
    public void setId(Long id) {
        this.id = id;
    }
    
}
