
class BankAccount{
    double balance;
    String acc;
    BankAccount(){}
    BankAccount(double balance,String acc){
        this.balance = balance;
        this.acc = acc;
    }
    public double getBalance(){
        return balance;
    }
    public String getAcc(){
        return acc;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAcc(String acc){
        this.acc = acc;
    }
}
class CheckingAccount extends BankAccount{
    double limit;
}
class SavingsAccount extends BankAccount{
    double limit;
}
class COD extends BankAccount{
    double limit;
}

class Account{
    public static void main(String[] args){
        BankAccount a = new BankAccount(23456,"1234567890234567");
        System.out.println(a.getBalance());
        System.out.println(a.getAcc());
    }
}