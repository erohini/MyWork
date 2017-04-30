//Java program for developing a banking software

package bankpackage;

import java.util.Scanner;

public class AppForBank {

	public static void main(String[] args) {
		
		//Declaring variables
		int check_acc, choice, exit;
		check_acc = 1;
		exit = 0;
		choice = 0;
		String s;
	
        Check_acc Check_obj = new Check_acc();
        
        System.out.println("Welcome");
        
                
        if(check_acc == 1)
        {
           do
           	{
        	   //Displaying menu for the customer
        	   System.out.println(" \n Menu");
        	   System.out.println("1. New Entry ");
        	   System.out.println("2. Display Entry Details ");
        	   System.out.println("3. Deposit amount: ");
        	   System.out.println("4. Withdraw amount: ");
        	   System.out.println("5. Exit");
        	   System.out.print("Select your choice:  ");
        	   System.out.flush();
                 try{
                      Scanner input = new Scanner((System.in));
                      s = input.nextLine();
                      choice = Integer.parseInt(s);

                             switch(choice)
                              {
                              	case 1: 
                                  Check_obj.new_acc();
                                  break;
                              	case 2:  
                              	  Check_obj.display();
                              	  break;
                                case 3: 
                                  Check_obj.deposit();
                                  break;
                                case 4: 
                                  Check_obj.withdraw();
                                  break;
                                case 5: 
                                  System.out.println("\n Exits Checking Account");
                                  break;
                  default: System.out.println("\n Invalid Choice \n");
                }
          }
      catch(Exception e){}
           	}
           while(choice != 5);
        }
                     
        }
        }


	class Check_acc      
		{
         final int max_limit = 30;
         final  int min_limit = 1;
         final double min_bal = 25;
         int total_rec=0;
         private  String name[] = new String[30];
         private int acc_no[] = new int[20];         
         private double bal_amt[] = new double[20];
         private  String acc_type[] = new String[20];
         
        
        
         public void initialize()
        {
             for(int k = 0; k < max_limit; k++)
             {
                name[k] = " ";
                acc_no[k] = 0;
                bal_amt[k] = 0.0;
                acc_type[k] = " ";
                
            }
        }

           //Creating new account
              public void new_acc()
        {
               String s;
               boolean open;
                open = true;

               if (total_rec > max_limit)
               {
                    System.out.println("\n We are Sorry. We cannot open an account for you.\n");
                    open =false;
               }

               if(open = true)   
               	{
                   total_rec++;                       
                   System.out.println("\n Record new entry");
                   	try{
                              acc_no[total_rec] = total_rec;   
                              System.out.println("Account Number:  "+acc_no[total_rec]);
                           
                            
                         Scanner input = new Scanner((System.in));
                         System.out.print("Please enter your name:  ");
                         System.out.flush();
                         name[total_rec] = input.nextLine();            
                         acc_type[total_rec] = "Checking Account";
                         System.out.println("Account Type: "+acc_type[total_rec]);                     

                        do{
                               System.out.print("Please enter first deposit amount with minimum balance of $25: ");
                               System.out.flush();
                               s = input.nextLine();
                               bal_amt[total_rec] = Double.parseDouble(s);
                             }while(bal_amt[total_rec] < min_bal);   
                        
                      System.out.println("\n");
                        }
                   	
                    catch(Exception e)
                    {}
                   	
                }
        }
        
        //A method to display the account details
        public void display()
        {
              String s;
              int ac_no;
              ac_no = 0;
              boolean authentic = true;
                           
              System.out.println("\n Account Details \n");
              	try{
                 Scanner input = new Scanner((System.in));
                 System.out.println("Enter Account number: ");
                 System.out.flush();
                 s = input.nextLine();
                 ac_no = Integer.parseInt(s);
                  if (ac_no < min_limit  || ac_no > total_rec)   
                     {
                          System.out.println("\n Invalid Account Number \n");
                          authentic = false;
                     }

                    if (authentic == true)
                      {     
                        System.out.println("\nAccount Number: "+acc_no[ac_no]);
                        System.out.println("Name: "+name[ac_no]);
                        System.out.println("Account Type: "+acc_type[ac_no]);
                        System.out.println("Balance Amount: "+bal_amt[ac_no]+"\n");
                      }
                 }
            catch(Exception e)
            {}
        }     
        
        //A method to deposit the amount
        public void deposit()
        {
              String s;
              double amt;
              int acc_no;
              boolean authentic = true;
              System.out.println("\n Deposited Amount");
              
              	try{
                   //Getting deposit amount from the account holder
                   Scanner input = new Scanner((System.in));

                        System.out.println("Please enter your Account Number: ");
                        System.out.flush();
                        s = input.nextLine();
                        acc_no=Integer.parseInt(s);
                         if (acc_no < min_limit || acc_no > total_rec)   
                         {
                              System.out.println("\n Invalid Account Number \n");
                              authentic = false;
                         }
           
                        if (authentic == true)
                        	{
                            System.out.println("Please enter amount to be deposited: ");
                            System.out.flush();
                            s = input.nextLine();
                            amt=Double.parseDouble(s);

                            bal_amt[acc_no]=bal_amt[acc_no]+amt;
                             
                            System.out.println("Account Number:  "+acc_no);
                            System.out.println("Balance Amount:  "+bal_amt[acc_no]+"\n");
                        }
                 }
            catch(Exception e)
            {}
       }
            
        
        //A method to withdraw the amount
        public void withdraw()
        {
              String s;
              double amt, checking_amt;
              int acc_no;
              boolean authentic = true;
            
              
              try{
                   //Getting withdrawal amount from the account holder
                   Scanner input = new Scanner((System.in));
                   
                        System.out.println("Please enter your Account Number : ");
                        System.out.flush();
                        s = input.nextLine();
                        acc_no = Integer.parseInt(s);

                          if (acc_no < min_limit || acc_no > total_rec)   //To check whether accNo is valid or Not
                             {
                                System.out.println("\n Invalid Account Number \n");
                                authentic = false;
                            }

                        if (authentic == true)
                        {
                                System.out.println("Balance: "+bal_amt[acc_no]);
                                System.out.println("Please enter your withdrawal amount: ");
                                System.out.flush();
                                s = input.nextLine();
                                amt = Double.parseDouble(s);
                                checking_amt=bal_amt[acc_no]-amt;
                                if(checking_amt >= min_bal)
                                {
                                   bal_amt[acc_no] = checking_amt;
                                   
                                  
                                   System.out.println("Account Number:  "+acc_no);
                                   System.out.println("Balance Amount:  "+bal_amt[acc_no]+"\n");
                               }
                               else
                                {
                                   System.out.println("\n Sorry. Your account has insufficient funds");
                           
                               }
                       }
                }
           catch(Exception e)
           {}
      }

		}

	
