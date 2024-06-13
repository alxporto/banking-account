import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
      //TODO: To know and import the Scanner class
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
      //Obtain the values ​​entered in the terminal using the Scanner class and show the messages to the users
      System.out.println("Please, inform the account number:");
      int accountNumber = scanner.nextInt();

      System.out.println("Please, inform the agency number:");
      String agencyNumber = scanner.next();
      
      System.out.println("Please, inform the client name:");
      String clientName = scanner.next();

      System.out.println("Please, inform the balance of the account: ");
      double balance = scanner.nextDouble();
      
      //Display the message from the created account
      System.out.println("Hello " + clientName + ", thank you for creating an account with our bank, your agency is " + agencyNumber + ", account " + accountNumber + " and your balance " + balance + " is now available for withdraw.");        
    }
}