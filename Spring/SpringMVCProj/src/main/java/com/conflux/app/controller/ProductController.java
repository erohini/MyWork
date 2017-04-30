package com.conflux.app.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.conflux.app.dao.IProductDAO;
import com.conflux.app.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	private SessionFactory sessionFactory;
	private IProductDAO iProductDAO;
	Product product;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public String addProcessRequest(){
		iProductDAO.getProduct();
		iProductDAO.addProduct(product);
		return null;
	}
	
	//@RequestMapping("/productSearch")
	/*public ModelAndView searchProductProcess(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("productId"));
		Session session=sessionFactory.openSession();
		Product product = (Product) session.get(Product.class, id);
		ModelAndView modelAndView =new ModelAndView("productView");
		modelAndView.addObject("product",product);
		return modelAndView;*/
	
	public ModelAndView fetchAllProducts(){
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from products");
		List<Product> list=query.list();
//		ModelAndView modelAndView = new ModelAndView("productrecords");
//		ModelAndView modelAndView = new ModelAndView("sampleView");
		ModelAndView modelAndView = new ModelAndView("productPdfView");
		modelAndView.addObject("products",list);
		return modelAndView;
	}

}
