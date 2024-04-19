package kr.co.yunju.product.management.infrastructure;

import kr.co.yunju.product.management.domain.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class DatabaseProductRepository {
    private JdbcTemplate jdbcTemplate;
    public DatabaseProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public Product add(Product product) {
        jdbcTemplate
                .update("INSERT INTO products (name, price, amount) VALUES (?, ?, ?)",
                        product.getName(),product.getPrice(),product.getAmount());

        return product;
    }
    public Product findById(Long id) {
        return null;
    }

    public List<Product> findAll() {
        return Collections.EMPTY_LIST;
    }

    public List<Product> findByNameContaining(String name) {
        return Collections.EMPTY_LIST;
    }

    public Product update(Product product) {
        return null;
    }

    public void delete(Long id) {
        // do nothing
    }
}
