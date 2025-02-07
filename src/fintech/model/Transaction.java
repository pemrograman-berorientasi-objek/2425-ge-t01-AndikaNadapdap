package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Transaction {
    // private int idCounter = 0;
    private int id = 1;
    private String account_name;
    private Double ammount ;
    private String note ;
    private String posted_at ;
    private String command;
    private Double balance;
    public Transaction(String account_name, Double ammount, String note, String posted_at , Double balance){
        // this.idCounter++;
        // this.id = idCounter;
        this.account_name = account_name;
        this.ammount = ammount;
        this.note = note;
        this.posted_at = posted_at;
        this.balance = ammount + balance;;
    }

    public String getaccount_name(){
        return account_name;
    }
    public Double getammount(){
        return ammount;
    }
    public String getnote(){
        return note;
    }
    public String getposted_at(){
        return posted_at;
    }
    public String getcommand(){
        return command;
    }
    public Double getbalance(){
        return balance;
    }

    @Override
    public String toString(){
        return this.id + "|" + this.account_name + '|' + this.ammount + '|' + this.posted_at + '|' + this.note + '|' + this.balance;
    }
}

