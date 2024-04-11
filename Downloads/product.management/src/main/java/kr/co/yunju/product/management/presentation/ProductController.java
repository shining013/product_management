package kr.co.yunju.product.management.presentation;

import kr.co.yunju.product.management.application.SimpleProductService;
import kr.co.yunju.product.management.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private SimpleProductService simpleProductService;
    @Autowired
    ProductController(SimpleProductService simpleProductService) {
        this.simpleProductService = simpleProductService;
    }
    @RequestMapping(value="/products", method= RequestMethod.POST)
    public Product createProduct(@RequestBody Product product) {
        return simpleProductService.add(product);
    }
}
