package com.prod.management.prodmanagement.service;

import com.prod.management.prodmanagement.dto.ProductDto;
import com.prod.management.prodmanagement.entity.Product;
import com.prod.management.prodmanagement.processor.ProductMapper;
import com.prod.management.prodmanagement.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    public final ProductRepository repository;
    public final ProductMapper mapper;

    public ProductDto getProducts(String name) {
        if (NumberUtils.isCreatable(name)) {
            Optional<Product> byId = repository.findById(Long.valueOf(name));
            ProductDto dto = mapper.toDTO(byId.orElse(null));
            return dto;
        }
        Product byProductName = repository.findByProductName(name);
        return mapper.toDTO(byProductName);
    }

}
