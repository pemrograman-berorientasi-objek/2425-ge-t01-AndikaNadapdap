package fintech.driver;

import java.util.Scanner;

import fintech.model.Account;

/**
 * @author 12S23013 - Andika Nadapdap
 * @author 12S23033 - Oloan Nainggolan
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0.0;
        String command = scan.nextLine();
        String owner = scan.nextLine();
        String account_name = scan.nextLine();
        Account account = new Account(command, owner, account_name, balance);
        System.out.println(account.toString());
    }
}