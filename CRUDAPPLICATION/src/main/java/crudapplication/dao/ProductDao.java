package crudapplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crudapplication.model.Product;

@Component
public class ProductDao {
@Autowired
private HibernateTemplate hibernateTemplate;
//create
@Transactional
public void createProduct(Product product) {
	//It will do both work update and save.
	this.hibernateTemplate.saveOrUpdate(product);
}
//get all product
public List<Product>getProduct(){
	List<Product> products=this.hibernateTemplate.loadAll(Product.class);
	return products;
	
}
//Delete single product
@Transactional
public void deleteProduct(int pid) {
	Product p=this.hibernateTemplate.load(Product.class,pid);
	this.hibernateTemplate.delete(p);
}
//Get single product
public Product getProduct(int pid) {
	return this.hibernateTemplate.get(Product.class,pid);
}
}
