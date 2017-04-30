package catalogue;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import com.business.*;
import com.model.Product;

@WebService(endpointInterface="catalogue.ProductCatelogurInterface",portName="TestMartCateloguePort",
			serviceName="TestMartCatelogueService")
public class ProductCatalogue implements ProductCatelogueInterface{
	ProductServiceImpl productService = new ProductServiceImpl();
	/* (non-Javadoc)
	 * @see catalogue.ProductCatelogueInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see catalogue.ProductCatelogueInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see catalogue.ProductCatelogueInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
		
	}
	
	/* (non-Javadoc)
	 * @see catalogue.ProductCatelogueInterface#getProductsv2(com.model.Product)
	 */
	@Override
	public List<Product> getProductsv2(Product category){
		return productService.getProductsv2(category);
	}
}
