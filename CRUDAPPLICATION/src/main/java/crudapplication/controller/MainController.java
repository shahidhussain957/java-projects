package crudapplication.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

import crudapplication.dao.ProductDao;
import crudapplication.model.Product;


@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/")
	public String home(Model m) {
	    List<Product> products = productDao.getProduct();
	    m.addAttribute("products", products); // Corrected this line
	    return "index";
	}

//Show add product form
@RequestMapping("/addproduct")
public String addproduct(Model m) {
	m.addAttribute("title","Add Product");
	return "addproduct_form";
}
//Add product form
@RequestMapping(value="/saveProduct",method=RequestMethod.POST)

public RedirectView SaveProduct(@ModelAttribute Product product,HttpServletRequest request) {//fetching data of form through Model
	System.out.println(product);
	productDao.createProduct(product);
	RedirectView redirectView=new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/");
	return redirectView;
}
//Delete handler
@RequestMapping("/delete/{productId}")
public RedirectView deleteProduct(@PathVariable("productId")int productId,HttpServletRequest request) {
	this.productDao.deleteProduct(productId);
	RedirectView redirectView=new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/");
	return redirectView;
}
@RequestMapping("/update/{productId}")
public String update(@PathVariable("productId") int pid,Model model) {
	Product product=this.productDao.getProduct(pid);
	model.addAttribute("product",product);
	return"updateform";
}
}


