package com.prod.management.prodmanagement.processor;

import com.prod.management.prodmanagement.dto.ProductDto;
import com.prod.management.prodmanagement.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    public ProductDto toDTO(Product product);
}
