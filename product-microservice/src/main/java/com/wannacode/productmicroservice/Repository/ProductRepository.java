package com.wannacode.productmicroservice.Repository;

import com.wannacode.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
