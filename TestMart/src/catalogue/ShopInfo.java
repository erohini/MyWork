package catalogue;

import javax.jws.WebService;

@WebService
public class ShopInfo {

	public String getShopinfo(String property){
		String response = "Invalid Property";
		if("shopName".equals(property)){
			response = "Test mart";
		}
		else if("since".equals(property)){
			response = "since 2016";
		}
		return response;
	}
}
