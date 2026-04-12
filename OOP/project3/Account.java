package project3;

public class Account {
    private int accountNO;
    private String name ; 
    private float amount ; 
 
    public void insert(int a, String n , float amt){
        this.accountNO = a;
        this.name = n;
        this.amount = amt; 
    }

    public void deposit(float amt ){
        this.amount = this.amount + amt ; 
        System.out.println(amt + " deposited");
    }

    public void withdraw(float amt){
        if (amount<amt){
            System.out.println("Insufficient Balance");
        }else{
            this.amount = this.amount - amt ; 
        }
    }

    public void checkBalance(){
        System.out.println("Balance = "+this.amount);
    }

    @Override
    public String toString() {
        return "Account [accountNO=" + accountNO + ", name=" + name + ", amount=" + amount + "]";
    }
}
