package bankApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	public static Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","hr","hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public void createAccount(){
		Connection connection = Menu.getConnection();
		System.out.println("Enter your id: ");
		int id = sc.nextInt();
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter initial amount: ");
		double amount = sc.nextDouble();
		String sql ="select max(acc_num) as max_acc_num from account";
		
		String queryCheck = "select count(*) from account where acc_num = ?";
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultset = stmt.executeQuery(sql);
			while(resultset.next()){
				int acc_num = (resultset.getInt("max_acc_num")+1);
				PreparedStatement ps = connection.prepareStatement(queryCheck);
				ps.setLong(1, acc_num);
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					int count = rs.getInt(1);
					if(count == 0){
						String query1 = "insert into account values(?,?)";
						PreparedStatement ps1 = connection.prepareStatement(query1);
						ps1.setInt(1, acc_num);
						ps1.setDouble(2, amount);
						ps1.executeQuery();
						String query2 = "insert into customer values(?,?,?)";
						PreparedStatement ps2 =connection.prepareStatement(query2);
						ps2.setInt(1, id);
						ps2.setString(2, name);
						ps2.setInt(3, acc_num);
						ps2.executeQuery();
						
						System.out.println("ID: "+id);
						System.out.println("Name: "+name);
						System.out.println("Account Number: "+acc_num);
						System.out.println("Amount: "+amount);
						ps1.close();
						ps2.close();
					}
				}
				
				
				rs.close();
				ps.close();
			}
			resultset.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	
	
	public void checkBalance(){
		Connection connection = Menu.getConnection();
		System.out.println("Enter your account number: ");
		int accountNumber = sc.nextInt();
		String query = "Select customer.id, customer.name, account.amount from account, customer where account.acc_num = ? and account.acc_num=customer.account_number";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, accountNumber);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int amount = rs.getInt("amount");
				
				System.out.println("ID: "+id);
				System.out.println("NAME: "+name);
				System.out.println("AMOUNT: "+amount);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void Deposit(){
		Connection connection = Menu.getConnection();
	}
}
