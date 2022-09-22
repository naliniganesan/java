# java
code
package loopsta.com;

import java.util.Scanner;

class Bank{
	float amount;
	void deposit(float depositamount) {
		amount=amount+depositamount;
		System.out.println("balance amount"+amount);
		
	}
	void withdraw(float withdrawamount) {
		if(withdrawamount>amount) {

			System.out.println("''''insufficent balance'''''");
			System.out.println("balance amount"+amount);
		}else {
		amount=amount-withdrawamount;
		System.out.println("balance amount"+amount);
	
	}
		
	}
	
}

public class BankAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            float damount,wamount;
            Scanner sc=new Scanner(System.in);
            int choice;
   		 Bank bobj=new Bank();
   		while(true) {
   		System.out.println("'''''''MENU FOR MY BANK'''''''''");
   		System.out.println("1.To Deposit");
   		System.out.println("2.To Withdraw");
   		System.out.println("Enter your choice");
   		 choice=sc.nextInt();
   		switch(choice) {
   		case 1:System.out.println("Enter the amount to deposit");
   		        damount=sc.nextFloat();
   		        bobj.deposit(damount);
   		        break;
   		case 2:System.out.println("Enter the amount you want to withdraw");
   		       wamount=sc.nextFloat();
   		       bobj.withdraw(wamount);
   		       break;
   		default:System.out.println("Invalid input");
   		}//switch
   		System.out.println("Do you want to continue (y/n)");
   		char op=sc.next().charAt(0);
   	    
   		if(op=='n') {
   			break;

   		}
   		
   		} //while
   		
   		System.out.println("EXIT");
   		
	}

}

