class user{
    String name;
    String accnum;
    int balance;
    
    public user(String name, String accnum, int balance){
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
    }
    
    public static String get_name(String name){
        return name;
    }
    public static String get_accnum(String accnum){
        return accnum;
    }
    public static int get_balance(int balance){
        return balance;
    }
    public String toString(){
        return (get_name + get_accnum + get_balance);
    }
}


public class bank
{
    user[]people;
    int index=0;
    public void addauser(user r){
        people[index]= r;
        index++;

    }


	// public static void main(String[] args) {
	//     user obj = new user("hari", "3234325345634", "340000");
	//     System.out.println(obj.get_name());
	//     System.out.println(obj.get_accnum());
	//     System.out.println(obj.get_balance());
    }
}
