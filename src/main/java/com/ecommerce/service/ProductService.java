package com.ecommerce.service;

import com.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
	Product createProduct(Product product);

	Product getProductById(Long id);

	Product updateProduct(Long id, Product product);

	void deleteProduct(Long id);

	List<Product> searchProducts(String query);
}
