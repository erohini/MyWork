package catalogue;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.model.Product;

@WebService(name="TestMartCatelogue",targetNamespace ="http://www.testmart.com")
public interface ProductCatelogueInterface {

	@WebMethod(action="fetch categories", operationName="fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	List<Product> getProductsv2(Product category);

}