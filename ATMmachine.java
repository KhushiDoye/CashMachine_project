import java.util.Scanner;
class ATMmachine
{
   public static void main(String args[])
   {
   int balance=20000,withdraw,deposit,num;
   Scanner sc=new Scanner(System.in);
   while(true)
   {
   	System.out.println(" ");
 	System.out.println("***WELCOME TO ATM***");
	System.out.println(" ");
	System.out.println("1.Withdraw");
        System.out.println(" ");
	System.out.println("2.Deposit");
        System.out.println(" ");
	System.out.println("3.Check Balance");
   	System.out.println(" ");
	System.out.println("4.EXIT");
	System.out.println(" ");
	System.out.println("Please choose your option...");
 	num=sc.nextInt();
	switch(num)
	{
   	case 1:
        System.out.println("< You choose to withdraw >");
   	System.out.println(" ");
	System.out.println("Enter Amount to be withdraw..");
        withdraw=sc.nextInt();
        if(balance>=withdraw)
  	{
	   balance=balance-withdraw;
	   System.out.println("you withdraw "+withdraw);
           System.out.println(" ");	
	   System.out.println("Amount withdraw successfully ");
	   System.out.println(" ");	   
	   System.out.println("Balance in your account is: "+balance); 
	   System.out.println(" ");	  
           System.out.println("Please collect your money");
	   System.out.println(" ");	
    	}
	else
	{
           System.out.println("Current Balance "+balance);
           System.out.println(" ");	   
           System.out.println("You don't have enough money to withdraw..Sorry!");
	}
System.out.println();
break;
      	case 2:
	System.out.println("< You choose to deposit >");
   	System.out.println(" ");
	System.out.println("How much money you want to deposit?");
        deposit=sc.nextInt();
        balance=balance+deposit;
	System.out.println("you deposit "+deposit);
	System.out.println(" ");	
	System.out.println("Amount deposited successfully "); 
	System.out.println(" ");	
	System.out.println("Now your current balance is: "+balance);
        System.out.println("");
 break;
	case 3:
	System.out.println("< You choose Check balance.. >");
   	System.out.println(" ");
 	System.out.println("Total Balance in your account is "+balance);
      	System.out.println();
		break;
	case 4:
 	System.out.println("Thankyou for visiting ATM...Have a nice day!!");
   	System.out.println(" ");
	System.exit(0);
 	System.out.println("");
        
        break;
	default:
	System.out.println("Something went wrong...Please try again..!");
        }
     }
  }
}