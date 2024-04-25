package com.wannacode.productmicroservice.Controller;

import com.wannacode.productmicroservice.entity.ProductEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    public List<ProductEntity> getAllProducts(){

    }
}
