

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(39367417 , "Ala Eddine Ghrib" , 10000);
        a1.deposit(12000);
        a1.withdraw(30000);
        a1.checkBalance();
        a1.toString();
    }
}
