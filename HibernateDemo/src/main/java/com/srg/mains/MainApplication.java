package com.srg.mains;

import com.srg.entities.ProductEntity;
import com.srg.repository.ProductRepository;

public class MainApplication {
	
	public static void main(String[] args) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setCode("APPLE-MAC");
		productEntity.setName("Apple mac book 15 inch");
		productEntity.setCategory("Electronic");
		productEntity.setPrice(1200d);
		
		
		ProductRepository productRepository = new ProductRepository();
		productRepository.save(productEntity);
	}

}
