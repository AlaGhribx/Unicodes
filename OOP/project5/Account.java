

public class Account {
    private int ID;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    private int balance;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(int Acc,String N,int Blc){
    this.ID = Acc;
    this.name = N;
    this.balance = Blc;
}
public Account(int Acc,String N){
    this.ID = Acc;
    this.name = N;
    
}
public void credit(int c){
    this.balance = balance + c;
}
public void debit(int d){
    if (balance >= d) {
        this.balance = balance - d;
    }else{
        System.out.println("Amount execeded balance");
    }
}
public void transferTo(Account account,int t){
    account.balance = account.balance + t;
    this.balance = balance - t ;
}
@Override
public String toString() {
    return "Account [ID=" + ID + ", name=" + name + ", balance=" + balance + "]";
}




}
