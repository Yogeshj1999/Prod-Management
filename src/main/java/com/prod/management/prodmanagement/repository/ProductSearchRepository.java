package com.prod.management.prodmanagement.repository;

import com.prod.management.prodmanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductSearchRepository extends JpaSpecificationExecutor<Product>{
}
