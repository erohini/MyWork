package com.conflux.app.view;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import com.conflux.app.entity.Product;

@Component("sampleView")
public class SampleView implements View {

	@Override
	public String getContentType() {
		
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> map, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Product> products=(List<Product>) map.get("products");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h2 align=center>Product Records</h2>");
		out.println("<table align=center border=2>");
		out.println("<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDescription</th></tr>");
		
		for(Product product:products){
			out.println("<tr>");
			out.println("<td>"+product.getId()+"</tr>");
			out.println("<td>"+product.getName()+"</tr>");
			out.println("<td>"+product.getPrice()+"</tr>");
			out.println("<td>"+product.getDescription()+"</tr>");
			out.println("</tr>");
		}
		
		out.println("</table></body></html>");

	}

	
}
