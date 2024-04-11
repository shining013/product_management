package kr.co.yunju.product.management.application;

import kr.co.yunju.product.management.domain.Product;
import kr.co.yunju.product.management.infrastructure.ListProductRepository;
import org.springframework.stereotype.Service;

@Service
public class SimpleProductService {
    private ListProductRepository listProductRepository;
    SimpleProductService(ListProductRepository listProductRepository) {
        this.listProductRepository = listProductRepository;
    }

    public Product add(Product product) {
        Product savedProduct = listProductRepository.add(product);
        return savedProduct;
    }
}
