package bankdemo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// Create one account
		Account acc = new Account(1001, "John Doe", 5000);
		while (true) {
			try {
		System.out.println("\n--- Banking Menu ---");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Show Balance");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		System.out.print("Enter amount to deposit: "); 
		acc.deposit(sc.nextDouble());
		break;
		case 2:
		System.out.print("Enter amount to withdraw: ");
		acc.withdraw(sc.nextDouble()); 
		break;
		case 3:
		acc.showBalance();
		break;
		case 4:
		System.out.println("Thank you! Exiting...");
		sc.close();
		System.exit(0);
		default:
		System.out.println("Invalid choice. Try again.");
		}
		}
		catch (InputMismatchException e) {
		System.out.println("Invalid input! Please enter numbers only.");
		sc.nextLine();
		// clear input buffer
		}
			catch (InsufficientBalanceException e) { System.out.println("Error: " + e.getMessage());
			}
			catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage()); }
			catch (Exception e) { System.out.println("Unexpected error: " + e);
			} 
			}
			}
	}

	


