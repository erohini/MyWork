package com.conflux.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.conflux.app.entity.Product;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class ProductPDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pdfWriter, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		List<Product> products=(List<Product>) map.get("products");
		Table table=new Table(4);
		table.addCell("ProductId");
		table.addCell("ProductName");
		table.addCell("ProductPrice");
		table.addCell("ProductDescription");
		
		for(Product product:products){
			table.addCell(product.getId()+"");
			table.addCell(product.getName()+"");
			table.addCell(product.getPrice()+"");
			table.addCell(product.getDescription()+"");
		}
		
		document.add(table);
	}

}
