package com.cg.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.products.dao.ProductsDao;
import com.cg.products.domain.ProductsDomain;
@Service
public class ProductsServiceImpl implements ProductsSeviceInterface {
	
@Autowired
   private ProductsDao productsDao;


	@Override
	public List<ProductsDomain> getAllProducts() {
		
		List<ProductsDomain> products = productsDao.findAll();
		// TODO Auto-generated method stub
		return products;
	}


	@Override
	public ProductsDomain createOrUpdateProducts(ProductsDomain product) {
		
		
		
		// TODO Auto-generated method stub
		ProductsDomain addedProduct =productsDao.save(product);
		return addedProduct;
	}


	@Override
	public Optional<ProductsDomain> getProductById(int id) {
		
		// TODO Auto-generated method stub
		return 	productsDao.findById(id);
	}


	@Override
	public void deleteById(ProductsDomain product) {
		productsDao.delete(product);
		
	}

}