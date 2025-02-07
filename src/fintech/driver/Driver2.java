package fintech.driver;

import fintech.model.Transaction;
import fintech.model.Account;
import java.util.Scanner;


/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0.0;
        String command = scan.nextLine();
        Account account = null;
        Transaction transaction = null;

        if (command.equals("create-account")) 
        { String owner = scan.nextLine();
        String account_name = scan.nextLine();
        account = new Account(command, owner, account_name, balance);
        }
        System.out.println(account.toString());

        command = scan.nextLine();
        
        if (command.equals("create-transaction") ){ 
        { 
        String account_name = scan.nextLine();
        Double ammount = Double.parseDouble(scan.nextLine());
        String posted_at = scan.nextLine();
        String note = scan.nextLine();
        transaction = new Transaction(account_name, ammount, note, posted_at, balance);
        }
        System.out.println(transaction.toString());
        
    }
}

    }

