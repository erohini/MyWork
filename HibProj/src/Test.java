import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Address;
import com.entity.Bid;
import com.entity.Buyer;
import com.entity.Category;
import com.entity.Item;
import com.entity.Product;
import com.entity.Supplier;
import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Buyer buyer = new Buyer(1001, "Sai","Ram",9999999999,1111,"Mobiles");
		Buyer buyer = new Buyer();
		Address address =new Address(2222,"Diwancheruvu","Rajahmundry");
		Bid bid1 = new Bid(11,2); 
		Bid bid2 = new Bid(11,6);
		
		Item item1 = new Item(5, "Yellow Shirt", 12);
		Item item2 = new Item(4, "Orange Shirt", 14);
		
		buyer.setAddress(address);
		buyer.getBids().add(bid1);
		buyer.getBids().add(bid2);
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(buyer);
		transaction.commit();
		
//		Criteria productCriteria = session.createCriteria(Product.class);
//		Criteria supplierCriteria = productCriteria.createCriteria("supplier");
//		
//		Criterion productCriterian = Restrictions.gt("price", 5000f);
//		productCriteria.add(productCriterian);
//		Criterion supplierCriterion = Restrictions.like("name","D%");
//		supplierCriteria.add(supplierCriterion);
//		List<Product> products = productCriteria.list();
//		for (Product product : products) {
//			Supplier supplier = product.getSupplier();
//			if(product!=null){
//				System.out.println("Product Id: "+product.getId());
//				System.out.println("Product Name: "+product.getName());
//				System.out.println("Product Price: "+product.getPrice());
//				System.out.println("Product Description: "+product.getDescription());
//			}
//			System.out.println();
//			if(supplier!=null){
//				System.out.println("SupplierId: "+supplier.getSupplier_id());
//				System.out.println("SupplierName: "+supplier.getSupplier_name());
//				
//				}
//			System.out.println();
//			System.out.println();
//		}
		
		
		
//		ProjectionList projectionList =Projections.projectionList();
//		projectionList.add(Projections.avg("price"));
//		criteria.setProjection(projectionList);
//		Double avgPrice = (Double) criteria.uniqueResult();
//		System.out.println("Average price: "+avgPrice);
		
		
//		Criterion criterion = Restrictions.gt("id", 4);
//		Criterion criterion2 = Restrictions.like("name", "D%");
		
		
		
		
		
//		criteria.add(criterion);
//		criteria.add(criterion2);
//		LogicalExpression logicalExpression = Restrictions.or(criterion, criterion2);
//		criteria.add(logicalExpression);
//		ProjectionList projectionList =Projections.projectionList();
//		projectionList.add(Projections.property("name"));
//		projectionList.add(Projections.property("price"));
//		criteria.setProjection(projectionList);
//		List<Objects[]>  objectArrList = criteria.list();
//		for (Objects[] objects : objectArrList) {
//			System.out.println("Name: "+objects[0]);
//			System.out.println("price: "+objects[1]);
//			System.out.println();
//		}
//		
//		
//		criteria.list();
		
		
		
//		List<Product> products = criteria.list();
//		for ( Product product : products) {
//			System.out.println("Product Id: "+product.getId());
//			System.out.println("Product Name: "+product.getName());
//			System.out.println("Product Price: "+product.getPrice());
//			System.out.println("Product Description: "+product.getDescription());
//			System.out.println();
//		}
//		criteria.list();
		
		
//		Query query = session.createQuery("select p, s from Product p left outer join p.supplier s");
//		List<Object[]> ObjectArrayList = query.list();
//		
//		for (Object[] objects : ObjectArrayList) {
//			Product product = (Product) objects[0];
//			Supplier supplier = (Supplier) objects[1];
//			
//			System.out.println("Product Id: "+product.getId());
//			System.out.println("Product Name: "+product.getName());
//			System.out.println("Product Price: "+product.getPrice());
//			System.out.println("Product Description: "+product.getDescription());
//			System.out.println();
//			
//			if(supplier!=null){
//			System.out.println("SupplierId: "+supplier.getSupplier_id());
//			System.out.println("SupplierName: "+supplier.getSupplier_name());
//			System.out.println();
//			System.out.println();
//			}
//			
//		}
		
//		Query query = session.createQuery("select Max(p.price) from Product p");
//		Float price = (Float) query.uniqueResult();
//		System.out.println("Maximum price: "+price);
		
//		Query query = session.createQuery("select p.name, p.price from Product p where p.id > 4 and p.name='D%'");
//		Object[] objects = (Object[]) query.uniqueResult();
//		System.out.println("Name: "+objects[0]);
//		System.out.println("price: "+objects[1]);
//		System.out.println();
		
		
		
		
//		Query query = session.createQuery("select p.name, p.price from Product p where p.id > :pid and p.name like :pname");
//		query.setInteger("pid", 4);
//		query.setString("pname", "m%");
//		
//		
//		List<Object[]> objectArrayList = query.list();
//		
//		for (Object[] objects : objectArrayList) {
//			System.out.println("Name: "+objects[0]);
//			System.out.println("price: "+objects[1]);
//			System.out.println();
//		}
//		
//		session.close();
		
//		List<Product> products = query.list();
//		for (Product product : products) {
//			System.out.println("Product Id: "+product.getId());
//			System.out.println("Product Name: "+product.getName());
//			System.out.println("Product Price: "+product.getPrice());
//			System.out.println("Product Description: "+product.getDescription());
//			System.out.println();
//		}
		
//		Bid bid = (Bid) session.get(Bid.class, 11);
//		System.out.println("BidID: "+bid.getId());
//		System.out.println("BidAmount: "+bid.getBidAmount());
//		System.out.println();
//		
//		Item item = bid.getItem();
//		
//		System.out.println("ItemId: "+item.getId());
//		System.out.println("Itemname: "+item.getName());
//		System.out.println("ItemPrice: "+item.getPrice());
//		System.out.println();
		
		
//		Item item = (Item) session.get(Item.class, 2);
//		System.out.println("ItemId: "+item.getId());
//		System.out.println("Itemname: "+item.getName());
//		System.out.println("ItemPrice: "+item.getPrice());
//		System.out.println();
//		
//		Set<Category> category=item.getCategory();
//		for (Category category2 : category) {
//			System.out.println("CategoryID: "+category2.getCategory_id());
//			System.out.println("CategoryName: "+category2.getCategory_name());
//			System.out.println();
//		}
//		
//		Set<Bid> bids=item.getBids();
//		
//		for (Bid bid : bids) {
//			System.out.println("BidID: "+bid.getId());
//			System.out.println("BidAmount: "+bid.getBidAmount());
//			System.out.println();
//		}
		
		//Product product = (Product) session.get(Product.class, 1);
//		Product product = new Product(7,"KitKat",3,"Have a Break");
//		Transaction transaction = session.getTransaction();
//		transaction.begin();
//		session.save(product);
//		transaction.commit();
//		
//		System.out.println("Product Id: "+product.getId());
//		System.out.println("Product Name: "+product.getName());
//		System.out.println("Product Price: "+product.getPrice());
//		System.out.println("Product Description: "+product.getDescription());
		
		session.close();
		sessionFactory.close();

	}

}
