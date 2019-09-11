package com.wiredbraincoffee.productapifunctional.repository;

import com.wiredbraincoffee.productapifunctional.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository
        extends ReactiveMongoRepository<Product, String> {
}
