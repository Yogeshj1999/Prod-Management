package com.prod.management.prodmanagement.controller;

import com.prod.management.prodmanagement.entity.Product;
import com.prod.management.prodmanagement.service.ProductService;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/search")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SearchManagerController {

    public final ProductService productService;

    @Timed("API")
    @GetMapping("/product/{name}")
    public ResponseEntity<Product> search(@PathVariable String name){
        return new ResponseEntity( productService.getProducts(name),HttpStatus.OK);
    }

    @Timed("API")
    @GetMapping("/product")
    public ResponseEntity<Product> searchAll(){
        return new ResponseEntity( productService.getAllProducts(),HttpStatus.OK);
    }



//    @Timed("API")
//    @GetMapping("/product/{id}")
//    public ResponseEntity<Product> search(@PathVariable long id){
//        return new ResponseEntity( productService.getProducts(id).orElse(null),HttpStatus.OK);
//    }
}
