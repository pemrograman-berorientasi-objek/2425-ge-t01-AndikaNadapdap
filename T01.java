import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 0.0;
        String command = scan.nextLine();
        String owner = scan.nextLine();
        String account_name = scan.nextLine();

        System.out.println(account_name + '|' + owner + '|' + balance );
    }
}