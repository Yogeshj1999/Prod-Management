package com.prod.management.prodmanagement.processor;

import com.prod.management.prodmanagement.dto.ProductDto;
import com.prod.management.prodmanagement.entity.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
//@Component
public interface ProductMapper {

    public ProductDto toDTO(Product product);
}
