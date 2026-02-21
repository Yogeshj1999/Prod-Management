package com.prod.management.prodmanagement.repository;

import com.prod.management.prodmanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    public Product findByProductName(String productName);
}
