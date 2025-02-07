package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {
private  double balance ;
private  String owner;
private  String account_name;
private  String command;

public Account(String command, String owner, String account_name, double balance){
    this.command = command;
    this.owner = owner;
    this.account_name = account_name;
    this.balance = balance;
}

public String getOwner(){
    return owner;
}
public String getaccount_name(){
    return account_name;
}
public String getcommand(){
    return command;
}
public double getbalance(){
    return balance;
}
@Override
public String toString(){
    return account_name + '|' + owner + '|' + balance;
}
}