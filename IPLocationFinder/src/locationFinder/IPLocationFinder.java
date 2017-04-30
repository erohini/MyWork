package locationFinder;

import webServicex.GeoIPService;
import webServicex.*;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("pass the IP address");
		}
		else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			ipService.getGeoIPServiceSoap();
			GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = ipServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		}

	}

}
