package com.nguyen.api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductServiceAPI {
    @GetMapping(
            value = "/product/{productId}",
            produces = "application/json"
    )
    public Product getProduct(@PathVariable int productId);
}